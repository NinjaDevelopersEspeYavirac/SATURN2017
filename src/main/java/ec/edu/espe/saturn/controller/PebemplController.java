/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Pebempl;
import ec.edu.espe.saturn.service.PebemplService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author Pcmaster2
 */
public class PebemplController {

    private final static L log = new L(PebemplController.class);

    static {
        HibernateUtil.init();
    }

    /* public static Pebempl FindByPIDM(int pebemplPidm) {
        Pebempl findmPebempl = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (pebemplPidm != 0) {
               findmPebempl = PebemplService.FindByPIDM(pebemplPidm);
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
        return findmPebempl;

    }
    //poner aqui el nuevo controlador de PebemplController
    //
    //
    //*/

    public static Pebempl FindByPIDM_H(int pebemplPidm) {

        Pebempl findmPebempl = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {

            if (pebemplPidm != 0) {
                findmPebempl = PebemplService.findByPIDM_H(pebemplPidm);

            }
        } catch (Exception ex) {
            log.level.error("FindByPIDM_H: " + ex.getMessage());
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
        return findmPebempl;
    }
}
