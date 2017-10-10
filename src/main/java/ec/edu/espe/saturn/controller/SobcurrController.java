/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.model.Sobcurr;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.service.SobcurrService;
import java.util.List;

/**
 *
 * @author Pcmaster2
 */
public class SobcurrController {
    private final static L log = new L(SobcurrController.class);

    static {
        HibernateUtil.init();
    }
    public static List<Sobcurr> ListSobcurr() {
    List<Sobcurr> findmSpbpers = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            findmSpbpers = SobcurrService.listSobcurr();
        } catch (Exception ex) {
            log.level.error("ListSobcurr : " + ex.getMessage());
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
    
