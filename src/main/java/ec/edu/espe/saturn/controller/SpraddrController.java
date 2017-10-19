/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Spraddr;
import ec.edu.espe.saturn.service.SpraddrService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author Gabriel-PC
 */
public class SpraddrController {
    private final static L log = new L(SpraddrController.class);

    static {
        HibernateUtil.init();
    }
 
    public static List<Spraddr> FindByPIDM(int spraddrPidm) {

        List<Spraddr> findmSpraddr = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {

            if (spraddrPidm != 0) {
                findmSpraddr = SpraddrService.FindByPIDM(spraddrPidm);

            }
        } catch (Exception ex) {
            log.level.error("FindByPIDM : " + ex.getMessage());
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
        return findmSpraddr;
    }
         public static List<Spraddr> findByPidem_h(int spraddrPidm) {
        List<Spraddr> findmSpraddr = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (spraddrPidm != 0) {
                findmSpraddr = SpraddrService.findByPIDMH(spraddrPidm);
            }
        } catch (Exception ex) {
            log.level.error("HFindByPidem : " + ex.getMessage());
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
        return findmSpraddr;

    }
}
