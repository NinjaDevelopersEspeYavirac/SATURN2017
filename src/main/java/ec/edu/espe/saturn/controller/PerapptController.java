/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Perappt;
import ec.edu.espe.saturn.service.PerapptService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author Pcmaster2
 */
public class PerapptController {
    
    private final static L log = new L(PerapptController.class);
    
    static {
        HibernateUtil.init();
    }
    
     public static List<Perappt> FindByPidmPerappt(int perapptPidm) {

        List<Perappt> findmPerappt = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (perapptPidm != 0) {
                findmPerappt = PerapptService.FindByPidmPerappt(perapptPidm);

            }
        } catch (Exception ex) {
            log.level.error("FindByPidmPerappt: " + ex.getMessage());
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
        return findmPerappt;
    }
}
