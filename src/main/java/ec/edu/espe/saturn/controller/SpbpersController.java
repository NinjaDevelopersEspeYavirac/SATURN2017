/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Spbpers;
import ec.edu.espe.saturn.service.SpbpersService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;

/**
 *
 * @author joseostaiza
 */
public class SpbpersController {

    private final static L log = new L(SpbpersController.class);

    static {
        HibernateUtil.init();
    }

    

    public static Spbpers FindByCedula(String spbpers) {
        Spbpers findmSpbpers = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (spbpers != null) {
                findmSpbpers = SpbpersService.FindByCedula(spbpers);
            }
        } catch (Exception ex) {
            log.level.error("FindUserLogin : " + ex.getMessage());
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
        return findmSpbpers;

    
    }

    public static Spbpers FindByPIDM(int spridenPidm) {
        Spbpers findmSpbpers = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (spridenPidm != 0) {
               findmSpbpers = SpbpersService.FindByPIDM(spridenPidm);
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
        return findmSpbpers;

    }

   public static Spbpers FyndByUserId(String spbpersUserId) {
        Spbpers findmSpbpers = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (spbpersUserId != null) {
                findmSpbpers = SpbpersService.FindByUserId(spbpersUserId);
            }
        } catch (Exception ex) {
            log.level.error("FindUserId : " + ex.getMessage());
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
        return findmSpbpers;

    
    }   
}
