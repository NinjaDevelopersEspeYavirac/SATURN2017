/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Sobcurr;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author luis
 */
public class SobcurrService {
    
    private final static L log = new  L(SobcurrService.class);
    
    public static List<Sobcurr> listSobcurr() {
        List<Sobcurr> findmSobcurr = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                    getSessionFactory().getCurrentSession());
            
            List parameList = new ArrayList();

            List<Sobcurr> listCurrs = ds.customQuery(parameList, Sobcurr.class);

            if (!listCurrs.isEmpty()) {
                findmSobcurr = listCurrs;
            }

        } catch (HibernateException ex) {
            log.level.info("listSobcurr : " + ex.getMessage());
        }

        return findmSobcurr;
    }
}
