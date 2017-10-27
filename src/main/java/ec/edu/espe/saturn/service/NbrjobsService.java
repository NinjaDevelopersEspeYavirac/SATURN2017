/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.dao.QueryParameter;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Nbrjobs;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Pcmaster2
 */
public class NbrjobsService {

    private final static L log = new L(NbrjobsService.class);

    public static List<Nbrjobs> FindByPIDMNbrjobs(int spbpersPidm) {
        List<Nbrjobs> findmNbrjobs = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                    getSessionFactory().getCurrentSession());
            QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
            query_1.setColumnName("id.nbrjobsPidm");
            query_1.setWhereClause("=");
            query_1.setValue(spbpersPidm);
            List parameList = new ArrayList();
            parameList.add(query_1);
            List< Nbrjobs> listClients = ds.customQuery(parameList, Nbrjobs.class);
            if (!listClients.isEmpty()) {
                findmNbrjobs = listClients;
            }
        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }

        return findmNbrjobs;
    }
}
