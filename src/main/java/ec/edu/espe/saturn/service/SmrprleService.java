/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Smrprle;
import ec.edu.espe.saturn.model.Sobcurr;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author luis
 */
public class SmrprleService {

    private final static L log = new L(SmrprleService.class);

    public static List<Smrprle> listSmrprle() {
        List<Smrprle> findmSmrprle = new ArrayList<Smrprle>();
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                    getSessionFactory().getCurrentSession());

            List parameList = new ArrayList();

            List<Smrprle> listCurrs = ds.customQuery(parameList, Smrprle.class);

            if (!listCurrs.isEmpty()) {
                for (Smrprle obj : listCurrs) {
                    obj.setCurrs(new ArrayList<Sobcurr>(obj.getSobcurrs()));
                    findmSmrprle.add(obj);
                    System.out.println(">> ");
                }
            }

        } catch (HibernateException ex) {
            log.level.info("listSmrprle : " + ex.getMessage());
        }

        return findmSmrprle;
    }
}
