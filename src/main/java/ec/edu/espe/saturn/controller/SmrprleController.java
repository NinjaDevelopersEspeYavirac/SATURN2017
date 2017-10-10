/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Smrprle;
import ec.edu.espe.saturn.service.SmrprleService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class SmrprleController {

    private final static L log = new L(SmrprleController.class);

    static {
        HibernateUtil.init();
    }

    public static List<Smrprle> ListSmrprle() {
        List<Smrprle> findmSpbpers = new ArrayList<Smrprle>();
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            findmSpbpers = SmrprleService.listSmrprle();
        } catch (Exception ex) {
            log.level.error("ListSmrprle : " + ex.getMessage());
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
