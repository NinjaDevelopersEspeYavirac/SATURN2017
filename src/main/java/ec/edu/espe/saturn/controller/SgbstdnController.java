/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Sgbstdn;
import ec.edu.espe.saturn.service.SgbstdnService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author Pcmaster2
 */
public class SgbstdnController {

    private final static L log = new L(SgbstdnController.class);

    static {
        HibernateUtil.init();
    }

    public static Sgbstdn FindByPIDM_H(int sgbstdnPidm) {
        Sgbstdn findmSgbstdn = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (sgbstdnPidm != 0) {
                //findmSgbstdn = SgbstdnService.FindByPIDM_H(sgbstdnPidm);
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
        return findmSgbstdn;
    }

    public static List<Sgbstdn> FindByPIDM(int sgbstdnPidm) {

        List<Sgbstdn> findmSgbstdn = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (sgbstdnPidm != 0) {
                findmSgbstdn = SgbstdnService.FindByPIDM_H(sgbstdnPidm);
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
        return findmSgbstdn;
    }
}
