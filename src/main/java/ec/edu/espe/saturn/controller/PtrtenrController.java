/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Ptrtenr;
import ec.edu.espe.saturn.service.PtrtenrService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;

/**
 *
 * @author GABRIEL
 */
public class PtrtenrController {
    
    private final static L log = new L(PtrtenrController.class);

    static {
        HibernateUtil.init();
    }

    

    public static Ptrtenr FindByCode(String ptrtenrCode) {
       Ptrtenr findmSpbpers = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (ptrtenrCode != null) {
                findmSpbpers = PtrtenrService.FindByCode(ptrtenrCode);
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
    
}
