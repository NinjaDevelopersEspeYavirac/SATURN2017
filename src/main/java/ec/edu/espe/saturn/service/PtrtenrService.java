/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.dao.QueryParameter;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Ptrtenr;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author GABRIEL
 */

public class PtrtenrService {

    private final static L log = new L(SpbpersService.class);

    /**
     *
     * @param ptrtenrCode
     * @return
     */
       public static Ptrtenr FindByCode(String ptrtenrCode) {
        Ptrtenr  findmSpbpers = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                    getSessionFactory().getCurrentSession());
            QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
            query_1.setColumnName("ptrtenrCode");
            query_1.setWhereClause("=");
            query_1.setValue(ptrtenrCode);
            List parameList = new ArrayList();
            parameList.add(query_1);
            List< Ptrtenr > listClients = ds.customQuery(parameList, Ptrtenr .class);
            if (!listClients.isEmpty()) {
                findmSpbpers = listClients.get(0);
            }
        } catch (HibernateException ex) {
            log.level.info("FindByCode : " + ex.getMessage());
        }

        return findmSpbpers;
    }

  
    
}
