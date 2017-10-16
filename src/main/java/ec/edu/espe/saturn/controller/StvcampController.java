/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Stvcamp;
import ec.edu.espe.saturn.service.StvcampService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author Pcmaster2
 */
public class StvcampController {

    private final static L log = new L(SpridenController.class);

    static {
        HibernateUtil.init();
    }

    public static List<Stvcamp> FindByCode(String stvcampCode) {

        List<Stvcamp> findmStvcamp = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {

            if (stvcampCode != null && !stvcampCode.equals("")) {
                findmStvcamp = StvcampService.FindByCode(stvcampCode);

            }
        } catch (Exception ex) {
            log.level.error("FindByCode : " + ex.getMessage());
            delegateException = ex;
        } finally {
            hss.close();
            if (delegateException != null) {
                try {
                    throw delegateException;
                } catch (Exception ex) {
                    log.level.info("delageException " + ex.toString());
                }
            }
        }
        return findmStvcamp;
    }
}
