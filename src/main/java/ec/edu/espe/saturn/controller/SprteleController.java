/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.controller;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Sprtele;
import ec.edu.espe.saturn.service.SprteleService;
import ec.edu.espe.saturn.util.HibernateSessionHandler;
import java.util.List;

/**
 *
 * @author marlo
 */
public class SprteleController {
    private final static L log = new L(SpridenController.class);
    public static List<Sprtele> FindByPIDM(int sprtelePidm) {

        List<Sprtele> findmSprtele = null;
        HibernateSessionHandler hss = new HibernateSessionHandler();
        Exception delegateException = null;
        try {

            if (sprtelePidm != 0) {
                findmSprtele = SprteleService.FindByPIDM(sprtelePidm);

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
        return findmSprtele;
    }
}
