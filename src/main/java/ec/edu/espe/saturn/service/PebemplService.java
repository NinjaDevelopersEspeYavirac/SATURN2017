/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Pebempl;
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
public class PebemplService {

    private final static L log = new L(PebemplService.class);

    public static List<Pebempl> FindByPIDM(int pebemplPidm) {
        List<Pebempl> pebemplist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PAYROLL.PEBEMPL WHERE PEBEMPL_PIDM=" + pebemplPidm;
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {
                    Pebempl pebempl = new Pebempl();
                    BigDecimal pidm = null;
                    pidm = (BigDecimal) obj[0];
                    pebempl.setPebemplPidm((int) pidm.intValue());
                    pebempl.setPebemplEmplStatus((String) obj[1]);
                    pebempl.setPebemplCoasCodeHome((String) obj[2]);
                    pebempl.setPebemplOrgnCodeHome((String) obj[3]);
                    pebempl.setPebemplCoasCodeDist((String) obj[4]);//
                    pebempl.setPebemplOrgnCodeDist((String) obj[5]);//
                    pebempl.setPebemplEclsCode((String) obj[6]);
                    pebempl.setPebemplLcatCode((String) obj[7]);
                    pebempl.setPebemplBcatCode((String) obj[8]);
                    pebempl.setPebemplFirstHireDate((Date) obj[9]);
                    pebempl.setPebemplCurrentHireDate((Date) obj[10]);
                    pebempl.setPebemplAdjServiceDate((Date) obj[11]);
                    pebempl.setPebemplSeniorityDate((Date) obj[12]);
                    pebempl.setPebemplLreaCode((String) obj[13]);
                    pebempl.setPebemplLoaBegDate((Date) obj[14]);
                    pebempl.setPebemplLoaEndDate((Date) obj[15]);//
                    pebempl.setPebemplTreaCode((String) obj[16]);
                    pebempl.setPebemplTermDate((Date) obj[17]);
                    pebempl.setPebemplI9FormInd((String) obj[18]);
                    pebempl.setPebemplI9Date((Date) obj[19]);
                    pebempl.setPebemplI9ExpireDate((Date) obj[20]);
                    pebempl.setPebemplActivityDate((Date) obj[21]);
                    pebempl.setPebemplWkprCode((String) obj[22]);
                    pebempl.setPebemplFlsaInd((String) obj[23]);
                    pebempl.setPebemplStgrCode((String) obj[24]);
                    Object sshort = obj[25];
                    if(sshort==null)sshort=0;
                    String objshort = sshort.toString();
                    pebempl.setPebemplDaysInCanada(Short.parseShort(objshort));
                    pebempl.setPebempl1042RecipientCd((String) obj[26]);
                    pebempl.setPebemplInternalFtPtInd((String) obj[27]);
                    pebempl.setPebemplDicdCode((String) obj[28]);
                    pebempl.setPebemplEgrpCode((String) obj[29]);
                    pebempl.setPebemplIpedsSoftMoneyInd((String) obj[30]);
                    pebempl.setPebemplFirstWorkDate((Date) obj[31]);
                    pebempl.setPebemplLastWorkDate((Date) obj[32]);
                    pebempl.setPebemplCalifPensionInd((String) obj[33]);
                    pebempl.setPebemplNrsiCode((String) obj[34]);
                    pebempl.setPebemplSsnLastName((String) obj[35]);
                    pebempl.setPebemplSsnFirstName((String) obj[36]);
                    pebempl.setPebemplSsnMi((String) obj[37]);
                    pebempl.setPebemplSsnSuffix((String) obj[38]);
                    pebempl.setPebemplJblnCode((String) obj[39]);
                    pebempl.setPebemplCollCode((String) obj[40]);
                    pebempl.setPebemplCampCode((String) obj[41]);
                    pebempl.setPebemplUserId((String) obj[42]);
                    pebempl.setPebemplDataOrigin((String) obj[43]);
                    pebempl.setPebemplEw2ConsentInd((String) obj[44]);
                    pebempl.setPebemplEw2ConsentDate((Date) obj[45]);
                    pebempl.setPebemplEw2ConsentUserId((String) obj[46]);
                    pebempl.setPebemplIpedsPrimaryFunction((String) obj[47]);
                    pebempl.setPebemplIpedsMedDentalInd((String) obj[48]);
                    pebempl.setPebemplEtaxConsentInd((String) obj[49]);
                    pebempl.setPebemplEtaxConsentDate((Date) obj[50]);
                    pebempl.setPebemplEtaxConsentUserId((String) obj[51]);   
                    pebemplist.add(pebempl);
                }
            } else {
                pebemplist = null;
            }

        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }

        return pebemplist;
    }
}
