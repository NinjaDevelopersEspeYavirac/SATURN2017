package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.dao.QueryParameter;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Spbpers;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

public class SpbpersService {

    private final static L log = new L(SpbpersService.class);

    /**
     *
     * @param spbpersPidm
     * @return
     */
    
        public static Spbpers FindByPIDM(int spbpersPidm) {
            Spbpers findmSpbpers = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                     getSessionFactory().getCurrentSession());
            QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
            query_1.setColumnName("spbpersPidm");
            query_1.setWhereClause("=");
            query_1.setValue(spbpersPidm);
            List parameList = new ArrayList();
            parameList.add(query_1);
            List < Spbpers > listClients = ds.customQuery(parameList, Spbpers.class);
                        if (!listClients.isEmpty()) {
                findmSpbpers = listClients.get(0);
                            }
        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }

        return findmSpbpers;
    }

     public static Spbpers FindByCedula(String spbpersSsn) {
        Spbpers findmSpbpers = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                     getSessionFactory().getCurrentSession());
            QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
            query_1.setColumnName("spbpersSsn");
            query_1.setWhereClause("=");
            query_1.setValue(spbpersSsn);
            List parameList = new ArrayList();
            parameList.add(query_1);
            List < Spbpers > listClients = ds.customQuery(parameList, Spbpers.class);
                        if (!listClients.isEmpty()) {
                findmSpbpers = listClients.get(0);
                            }
        } catch (HibernateException ex) {
            log.level.info("FindByCedula : " + ex.getMessage());
        }

        return findmSpbpers;
    }
     
     public static Spbpers FindByUserId(String spbpersUserId) {
        Spbpers findmSpbpers = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                     getSessionFactory().getCurrentSession());
            QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
            query_1.setColumnName("spbpersUserId");
            query_1.setWhereClause("=");
            query_1.setValue(spbpersUserId);
            List parameList = new ArrayList();
            parameList.add(query_1);
            List < Spbpers > listClients = ds.customQuery(parameList, Spbpers.class);
                        if (!listClients.isEmpty()) {
                findmSpbpers = listClients.get(0);
                            }
        } catch (HibernateException ex) {
            log.level.info("FindByUserId : " + ex.getMessage());
        }

        return findmSpbpers;
    }
}