/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.dao.QueryParameter;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Spbpers;
import ec.edu.espe.saturn.model.Stvcamp;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Pcmaster2
 */
public class StvcampService {

    private final static L log = new L(StvcampService.class);

    public static List<Stvcamp> FindByCode(String stvcampCode) {
        Stvcamp stvcamp = new Stvcamp();
        List<Stvcamp> stvcamplist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM SATURN.STVCAMP WHERE STVCAMP_CODE = '" + stvcampCode + "'";
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {

                    stvcamp.setStvcampCode((String) obj[0]);
                    stvcamp.setStvcampDesc((String) obj[1]);
                    stvcamp.setStvcampActivityDate((Date) obj[2]);
                    stvcamp.setStvcampDicdCode((String) obj[3]);
                    stvcamplist.add(stvcamp);
                }
            } else {
                stvcamplist = null;
            }

        } catch (HibernateException ex) {
            log.level.info("FindByCode : " + ex.getMessage());
        }

        return stvcamplist;
    }
    
        public static Stvcamp HFindByCODE(String stvcampCode) {
        Stvcamp findmStvcamp = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                    getSessionFactory().getCurrentSession());
            QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
            query_1.setColumnName("stvcampCode");
            query_1.setWhereClause("=");
            query_1.setValue(stvcampCode);
            List parameList = new ArrayList();
            parameList.add(query_1);
            List< Stvcamp> listClients = ds.customQuery(parameList, Stvcamp.class);
            if (!listClients.isEmpty()) {
                findmStvcamp = listClients.get(0);
            }
        } catch (HibernateException ex) {
            log.level.info("HFindByCODE : " + ex.getMessage());
        }

        return findmStvcamp;
    }
}
