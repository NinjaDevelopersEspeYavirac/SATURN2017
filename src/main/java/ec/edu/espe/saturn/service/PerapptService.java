/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.dao.QueryParameter;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Perappt;
import ec.edu.espe.saturn.model.Perappt;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Pcmaster2
 */
public class PerapptService {
    
    private final static L log = new L(PerapptService.class);
    
    
   public static List<Perappt> FindByPidmPerappt(int perapptPidm) {
        List<Perappt> perapptist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PAYROLL.PERAPPT WHERE PERAPPT_PIDM=" + perapptPidm;
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {
                    Perappt perappt = new Perappt();
                    BigDecimal pidm = null;
                    pidm = (BigDecimal) obj[0];
                    perappt.getId().setPerapptPidm((int) pidm.intValue());
                    perappt.getId().setPerapptActionDate((Date) obj[1]);
                    perappt.getId().setPerapptOrgn((String) obj[2]);
                    perappt.getId().setPerapptCoasCode((String) obj[3]);
                    perappt.getId().setPerapptPosn((String) obj[4]);
                    perappt.getId().setPerapptSuff((String) obj[5]);
                    perappt.getId().setPerapptBeginDate((Date) obj[6]);
                    perappt.getId().setPerapptEndDate((Date) obj[7]);
                    perappt.getId().setPerapptApptEffDate((Date) obj[8]);
                    perappt.getId().setPerapptNextDate((Date) obj[9]);
                    perappt.getId().setPerapptTenureCode((String) obj[10]);
                    perappt.getId().setPerapptInitialTenure((String) obj[11]);
                    perappt.getId().setPerapptTenureEffDate((Date) obj[12]);
                    perappt.getId().setPerapptTenureTracBeginDate((Date) obj[13]);
                    perappt.getId().setPerapptTenureRevDate((Date) obj[14]);
                    perappt.getId().setPerapptRevtTenureCode((String) obj[15]);
                    perappt.getId().setPerapptRevtReappCode((String) obj[16]);
                    perappt.getId().setPerapptCredit((BigDecimal) obj[17]);
                    perappt.getId().setPerapptTerminalAppt((String) obj[18]);
                    perappt.getId().setPerapptDecisionDeferDate((Date) obj[19]);
                    perappt.getId().setPerapptDecision((String) obj[20]);
                    perappt.getId().setPerapptDecisionDate((Date) obj[21]);
                    perappt.getId().setPerapptComment((String) obj[22]);
                    perappt.getId().setPerapptDispCode((String) obj[23]);
                    perappt.getId().setPerapptFtypCode((String) obj[24]);
                    perappt.getId().setPerapptPrevGrtTenr((BigDecimal) obj[25]);
                    perappt.getId().setPerapptAppealDate((Date) obj[26]);
                    perappt.getId().setPerapptActivityDate((Date) obj[27]);
                    perappt.getId().setPerapptTenureFte((BigDecimal) obj[28]);
                    perappt.getId().setPerapptUserId((String) obj[29]);
                    perapptist.add(perappt);
                }
            } else {
                perapptist = null;
            }

        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }

        return perapptist;
    }
}

