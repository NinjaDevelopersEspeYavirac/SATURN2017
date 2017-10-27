/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Nbrjobs;
import ec.edu.espe.saturn.service.NbrjobsService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author Pcmaster2
 */
public class NbrjobsController {

    private final static L log = new L(SpridenController.class);

    static {
        HibernateUtil.init();
    }

    public static List<Nbrjobs> FindByPIDMNbrjobs(int goremalPidm) {

        List<Nbrjobs> findmNbrjobs = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {

            if (goremalPidm != 0) {
                findmNbrjobs = NbrjobsService.FindByPIDMNbrjobs(goremalPidm);

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
        return findmNbrjobs;
    }

}
