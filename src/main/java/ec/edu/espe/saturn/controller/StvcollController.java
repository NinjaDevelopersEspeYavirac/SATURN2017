/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;

import ec.edu.espe.saturn.model.Stvcoll;

import ec.edu.espe.saturn.service.StvcollService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author marlo
 */
public class StvcollController {
    private final static L log = new L(SpridenController.class);

    static {
        HibernateUtil.init();
    }

    public static List<Stvcoll> FindByCode(String stvcollCode) {

        List<Stvcoll> findmStvcoll = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {

            if (stvcollCode != null && !stvcollCode.equals("")) {
                findmStvcoll = StvcollService.FindByCode(stvcollCode);

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
        return findmStvcoll;
    }
}
