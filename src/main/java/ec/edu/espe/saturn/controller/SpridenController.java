package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Spriden;
import ec.edu.espe.saturn.service.SpridenService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import ec.edu.espe.saturn.util.HibernateUtil;

public class SpridenController {

    private final static L log = new L(SpridenController.class);

    static {
        HibernateUtil.init();
    }

    public static Spriden FindById(String spridenId) {//String spridenId
        Spriden findmSpriden = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {

            if (spridenId != null) {
                findmSpriden = SpridenService.FindById(spridenId);

            }
        } catch (Exception ex) {
            log.level.error("FindById : " + ex.getMessage());
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
        return findmSpriden;
    }

    public static Spriden FindByPIDM(int spridenPidm) {

        Spriden findmSpriden = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {

            if (spridenPidm != 0) {
                findmSpriden = SpridenService.FindByPIDM(spridenPidm);

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
        return findmSpriden;
    }

}
