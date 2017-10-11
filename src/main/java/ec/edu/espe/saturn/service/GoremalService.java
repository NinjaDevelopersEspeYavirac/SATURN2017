/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Goremal;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author marlo
 */
public class GoremalService {
    
    private final static L log = new L(SpridenService.class);
    
    public static List<Goremal> FindByPIDM(int goremalPidm) {
        List<Goremal> goremalist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM GOREMAL WHERE GOREMAL_PIDM=" + goremalPidm;
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {
                    Goremal goremal = new Goremal();
                    BigDecimal pidm = null;
                    pidm = (BigDecimal) obj[0];
                    goremal.getId().setGoremalPidm((int) pidm.intValue());
                    goremal.getId().setGoremalEmalCode((String) obj[1]);
                    goremal.getId().setGoremalEmailAddress((String) obj[2]);
                    goremal.setGoremalStatusInd((String) obj[3]);
                    goremal.setGoremalPreferredInd((String) obj[4]);
                    goremal.setGoremalActivityDate((Date) obj[5]);
                    goremal.setGoremalUserId((String) obj[6]);
                    goremal.setGoremalComment((String) obj[7]);
                    goremal.setGoremalDispWebInd((String) obj[8]);
                    goremal.setGoremalDataOrigin((String) obj[9]); 
                    goremalist.add(goremal);
                }
            } else {
                goremalist = null;
            }
            
        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }
        
        return goremalist;
    }
}
