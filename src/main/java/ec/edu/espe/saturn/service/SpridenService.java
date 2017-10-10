package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Spriden;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Uswer
 */
public class SpridenService {

    private final static L log = new L(SpridenService.class);

    public static Spriden FindById(String spridenId) {
        Spriden spriden = new Spriden();
        try {
            String sql = "SELECT * FROM SPRIDEN WHERE SPRIDEN_ID = '" + spridenId + "'";
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {
                    BigDecimal pidm = null;
                    pidm = (BigDecimal) obj[0];
                    spriden.getId().setSpridenPidm((int) pidm.intValue());
                    spriden.getId().setSpridenId((String) obj[1]);
                    spriden.getId().setSpridenLastName((String) obj[2]);
                    spriden.getId().setSpridenFirstName((String) obj[3]);
                    spriden.getId().setSpridenMi((String) obj[4]);
                    spriden.getId().setSpridenChangeInd((String) obj[5]);
                    spriden.getId().setSpridenEntityInd((String) obj[6]);
                    spriden.getId().setSpridenActivityDate((Date) obj[7]);
                    spriden.getId().setSpridenUser((String) obj[8]);
                    spriden.getId().setSpridenOrigin((String) obj[9]);
                    spriden.getId().setSpridenSearchLastName((String) obj[10]);
                    spriden.getId().setSpridenSearchFirstName((String) obj[11]);
                    spriden.getId().setSpridenSearchMi((String) obj[12]);
                    spriden.getId().setSpridenSoundexLastName((String) obj[13]);
                    spriden.getId().setSpridenSoundexFirstName((String) obj[14]);
                    spriden.getId().setSpridenNtypCode((String) obj[15]);
                    spriden.getId().setSpridenCreateUser((String) obj[16]);
                    spriden.getId().setSpridenCreateDate((Date) obj[17]);
                    spriden.getId().setSpridenDataOrigin((String) obj[18]);
                    spriden.getId().setSpridenCreateFdmnCode((String) obj[19]);
                    spriden.getId().setSpridenSurnamePrefix((String) obj[20]);

                }
            } else {
                spriden = null;
            }

        } catch (HibernateException ex) {
            log.level.info("FindById : " + ex.getMessage());
        }

        return spriden;
    }

    /**
     *
     * @param spridenPidm
     * @return
     */
    public static Spriden FindByPIDM(int spridenPidm) {
        Spriden spriden = new Spriden();
        try {
            String sql = "SELECT * FROM SPRIDEN WHERE SPRIDEN_PIDM = " + spridenPidm;
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {
                    BigDecimal pidm = null;
                    pidm = (BigDecimal) obj[0];
                    spriden.getId().setSpridenPidm((int) pidm.intValue());
                    spriden.getId().setSpridenId((String) obj[1]);
                    spriden.getId().setSpridenLastName((String) obj[2]);
                    spriden.getId().setSpridenFirstName((String) obj[3]);
                    spriden.getId().setSpridenMi((String) obj[4]);
                    spriden.getId().setSpridenChangeInd((String) obj[5]);
                    spriden.getId().setSpridenEntityInd((String) obj[6]);
                    spriden.getId().setSpridenActivityDate((Date) obj[7]);
                    spriden.getId().setSpridenUser((String) obj[8]);
                    spriden.getId().setSpridenOrigin((String) obj[9]);
                    spriden.getId().setSpridenSearchLastName((String) obj[10]);
                    spriden.getId().setSpridenSearchFirstName((String) obj[11]);
                    spriden.getId().setSpridenSearchMi((String) obj[12]);
                    spriden.getId().setSpridenSoundexLastName((String) obj[13]);
                    spriden.getId().setSpridenSoundexFirstName((String) obj[14]);
                    spriden.getId().setSpridenNtypCode((String) obj[15]);
                    spriden.getId().setSpridenCreateUser((String) obj[16]);
                    spriden.getId().setSpridenCreateDate((Date) obj[17]);
                    spriden.getId().setSpridenDataOrigin((String) obj[18]);
                    spriden.getId().setSpridenCreateFdmnCode((String) obj[19]);
                    spriden.getId().setSpridenSurnamePrefix((String) obj[20]);
                }
            } else {
                spriden = null;
            }

        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }

        return spriden;
    }

}
