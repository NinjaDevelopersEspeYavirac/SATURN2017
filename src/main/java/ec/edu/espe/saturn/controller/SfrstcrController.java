/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Sfrstcr;
import ec.edu.espe.saturn.service.SfrstcrService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author Pcmaster2
 */
public class SfrstcrController {

    private final static L log = new L(SpridenController.class);

    static {
        HibernateUtil.init();
    }

    public static List<Sfrstcr> FindByPidem(int sfrstcrPidm) {

        List<Sfrstcr> findmSfrstcr = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {

            if (sfrstcrPidm != 0) {
                findmSfrstcr = SfrstcrService.FindBypidem(sfrstcrPidm);

            }
        } catch (Exception ex) {
            log.level.error("FindByPidem : " + ex.getMessage());
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
        return findmSfrstcr;
    }

    public static Sfrstcr HFindByPidem(int sfrstcrPidm) {
        Sfrstcr findmSfrstcr = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (sfrstcrPidm != 0) {
                findmSfrstcr = SfrstcrService.HFindByPidem(sfrstcrPidm);
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
        return findmSfrstcr;

    }
}
