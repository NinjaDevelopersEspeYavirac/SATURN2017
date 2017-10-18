/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.dao.QueryParameter;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Sgbstdn;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Pcmaster2
 */
public class SgbstdnService {

    private final static L log = new L(SgbstdnService.class);

    /**
     *
     * @param sgbstdnPidm
     * @return
     */
    public static List<Sgbstdn> FindByPIDM_H(int sgbstdnPidm) {
        List<Sgbstdn> findmSgbstdn = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                    getSessionFactory().getCurrentSession());
            QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
            query_1.setColumnName("id.sgbstdnPidm");
            query_1.setWhereClause("=");
            query_1.setValue(sgbstdnPidm);
            List parameList = new ArrayList();
            parameList.add(query_1);
            List<Sgbstdn> listSgbstdn = ds.customQuery(parameList, Sgbstdn.class);
            if (!listSgbstdn.isEmpty()) {
                findmSgbstdn = listSgbstdn;
            }
        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }

        return findmSgbstdn;
    }

    public static List<Sgbstdn> FindByPIDM(int sgbstdnPidm) {

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String stringdata = "1900-09-03";
        List<Sgbstdn> sgbstdnlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM SATURN.SGBSTDN WHERE SGBSTDN_PIDM=" + sgbstdnPidm;
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {
                    Sgbstdn sgbstdn = new Sgbstdn();
                    BigDecimal pidm = null;
                    pidm = (BigDecimal) obj[0];

                    sgbstdn.getId().setSgbstdnPidm((int) pidm.intValue());
                    sgbstdn.getId().setSgbstdnTermCodeEff((String) obj[1]);
//                    sgbstdn.setSmrprleBySgbstdnProgram1((Smrprle) obj[2]);//Smrprle
//                    sgbstdn.setSmrprleBySgbstdnProgram2((Smrprle) obj[3]);//Smrprle
//                    sgbstdn.setSobcurrBySgbstdnCurrRule2((Sobcurr) obj[4]);//Sobcurr
//                    sgbstdn.setSobcurrBySgbstdnCurrRule1((Sobcurr) obj[4]);//Sobcurr
//                    sgbstdn.setStvcampBySgbstdnCampCode2((Stvcamp) obj[6]);//Stvcamp
//                    sgbstdn.setStvcampBySgbstdnCampCode((Stvcamp) obj[7]);//Stvcamp
//                    sgbstdn.setStvcollBySgbstdnCollCode2((Stvcoll) obj[8]);//Stvcoll
//                    sgbstdn.setStvcollBySgbstdnCollCode1((Stvcoll) obj[9]);//Stvcoll
//                    sgbstdn.setStvcollBySgbstdnCollCodeDual((Stvcoll) obj[10]);//Stvcoll
                    sgbstdn.setSgbstdnStstCode((String) obj[2]);
                    sgbstdn.setSgbstdnLevlCode((String) obj[3]);
                    sgbstdn.setSgbstdnStypCode((String) obj[4]);
                    sgbstdn.setSgbstdnTermCodeMatric((String) obj[5]);
                    sgbstdn.setSgbstdnTermCodeAdmit((String) obj[6]);
                    Object ExpGradDate = obj[7];
                    if (ExpGradDate == null) {
                        ExpGradDate = "1900-09-03";
                        try {
                            Date expgraddate = formatter.parse(stringdata);
                            sgbstdn.setSgbstdnExpGradDate(expgraddate);
                        } catch (Exception e) {
                            log.level.info("Error Fecha : " + e.getMessage());
                        }
                    } else {
                        sgbstdn.setSgbstdnExpGradDate((Date) ExpGradDate);
                    }
                    sgbstdn.setSgbstdnFullPartInd((String) obj[8]);
                    sgbstdn.setSgbstdnSessCode((String) obj[9]);
                    sgbstdn.setSgbstdnResdCode((String) obj[10]);
                    sgbstdn.setSgbstdnDegcCode1((String) obj[11]);
                    sgbstdn.setSgbstdnMajrCode1((String) obj[12]);
                    sgbstdn.setSgbstdnMajrCodeMinr1((String) obj[13]);
                    sgbstdn.setSgbstdnMajrCodeMinr12((String) obj[14]);
                    sgbstdn.setSgbstdnMajrCodeConc1((String) obj[15]);
                    sgbstdn.setSgbstdnMajrCodeConc12((String) obj[16]);
                    sgbstdn.setSgbstdnMajrCodeConc13((String) obj[17]);
                    sgbstdn.setSgbstdnDegcCode2((String) obj[18]);
                    sgbstdn.setSgbstdnMajrCode2((String) obj[19]);
                    sgbstdn.setSgbstdnMajrCodeMinr2((String) obj[20]);
                    sgbstdn.setSgbstdnMajrCodeMinr22((String) obj[21]);
                    sgbstdn.setSgbstdnMajrCodeConc2((String) obj[22]);
                    sgbstdn.setSgbstdnMajrCodeConc22((String) obj[23]);
                    sgbstdn.setSgbstdnMajrCodeConc23((String) obj[24]);
                    sgbstdn.setSgbstdnOrsnCode((String) obj[25]);
                    sgbstdn.setSgbstdnPracCode((String) obj[26]);
                    sgbstdn.setSgbstdnAdvrPidm((Integer) obj[27]);
                    sgbstdn.setSgbstdnGradCreditApprInd((String) obj[28]);
                    sgbstdn.setSgbstdnCaplCode((String) obj[29]);
                    sgbstdn.setSgbstdnLeavCode((String) obj[30]);
                    Object LeavFromDate = obj[31];
                    if (LeavFromDate == null) {
                        LeavFromDate = "1900-09-03";
                        try {
                            Date leavfromdate = formatter.parse(stringdata);
                            sgbstdn.setSgbstdnExpGradDate(leavfromdate);
                        } catch (Exception e) {
                            log.level.info("Error Fecha : " + e.getMessage());
                        }
                    } else {
                        sgbstdn.setSgbstdnLeavFromDate((Date) LeavFromDate);
                    }
                    Object LeavToDate = obj[32];
                    if (LeavToDate == null) {
                        LeavToDate = "1900-09-03";
                        try {
                            Date leavtodate = formatter.parse(stringdata);
                            sgbstdn.setSgbstdnExpGradDate(leavtodate);
                        } catch (Exception e) {
                            log.level.info("Error Fecha : " + e.getMessage());
                        }
                    } else {
                        sgbstdn.setSgbstdnLeavToDate((Date) LeavToDate);
                    }
                    sgbstdn.setSgbstdnAstdCode((String) obj[33]);
                    sgbstdn.setSgbstdnTermCodeAstd((String) obj[34]);
                    sgbstdn.setSgbstdnRateCode((String) obj[35]);
                    Object ActivityDate = obj[36];
                    if (ActivityDate == null) {
                        ActivityDate = "1900-09-03";
                        try {
                            Date activitydate = formatter.parse(stringdata);
                            sgbstdn.setSgbstdnExpGradDate(activitydate);
                        } catch (Exception e) {
                            log.level.info("Error Fecha : " + e.getMessage());
                        }
                    } else {
                        sgbstdn.setSgbstdnActivityDate((Date) ActivityDate);
                    }
                    sgbstdn.setSgbstdnMajrCode22((String) obj[37]);
                    sgbstdn.setSgbstdnEdlvCode((String) obj[38]);
                    //sgbstdn.setSgbstdnIncmCode((String) obj[39]);//Timestamp
                    sgbstdn.setSgbstdnAdmtCode((String) obj[39]);
                    sgbstdn.setSgbstdnEmexCode((String) obj[41]);
                    sgbstdn.setSgbstdnAprnCode((String) obj[41]);
                    sgbstdn.setSgbstdnTrcnCode((String) obj[42]);
                    sgbstdn.setSgbstdnGainCode((String) obj[43]);
                    sgbstdn.setSgbstdnVoedCode((String) obj[44]);
                    sgbstdn.setSgbstdnBlckCode((String) obj[45]);
                    sgbstdn.setSgbstdnTermCodeGrad((String) obj[46]);
                    sgbstdn.setSgbstdnAcyrCode((String) obj[47]);
                    sgbstdn.setSgbstdnDeptCode((String) obj[48]);
                    sgbstdn.setSgbstdnSiteCode((String) obj[49]);
                    sgbstdn.setSgbstdnDeptCode2((String) obj[50]);
                    sgbstdn.setSgbstdnEgolCode((String) obj[51]);
                    sgbstdn.setSgbstdnDegcCodeDual((String) obj[52]);
                    sgbstdn.setSgbstdnLevlCodeDual((String) obj[53]);
                    sgbstdn.setSgbstdnDeptCodeDual((String) obj[54]);
                    sgbstdn.setSgbstdnMajrCodeDual((String) obj[55]);
                    sgbstdn.setSgbstdnBsklCode((String) obj[56]);
                    sgbstdn.setSgbstdnPrimRollInd((String) obj[57]);
                    sgbstdn.setSgbstdnTermCodeCtlg1((String) obj[58]);
                    sgbstdn.setSgbstdnDeptCode12((String) obj[59]);
                    sgbstdn.setSgbstdnMajrCodeConc121((String) obj[60]);
                    sgbstdn.setSgbstdnMajrCodeConc122((String) obj[61]);
                    sgbstdn.setSgbstdnMajrCodeConc123((String) obj[62]);
                    sgbstdn.setSgbstdnSecdRollInd((String) obj[63]);
                    sgbstdn.setSgbstdnTermCodeAdmit2((String) obj[64]);
                    sgbstdn.setSgbstdnAdmtCode2((String) obj[65]);
                    sgbstdn.setSgbstdnTermCodeCtlg2((String) obj[66]);
                    sgbstdn.setSgbstdnLevlCode2((String) obj[67]);
                    sgbstdn.setSgbstdnDeptCode22((String) obj[68]);
                    sgbstdn.setSgbstdnMajrCodeConc221((String) obj[69]);
                    sgbstdn.setSgbstdnMajrCodeConc222((String) obj[70]);
                    sgbstdn.setSgbstdnMajrCodeConc223((String) obj[71]);
                    sgbstdn.setSgbstdnCmjrRule11((Integer) obj[72]);
                    sgbstdn.setSgbstdnCconRule111((Integer) obj[73]);
                    sgbstdn.setSgbstdnCconRule112((Integer) obj[74]);
                    sgbstdn.setSgbstdnCconRule113((Integer) obj[75]);
                    sgbstdn.setSgbstdnCmjrRule12((Integer) obj[76]);
                    sgbstdn.setSgbstdnCconRule121((Integer) obj[77]);
                    sgbstdn.setSgbstdnCconRule122((Integer) obj[78]);
                    sgbstdn.setSgbstdnCconRule123((Integer) obj[79]);
                    sgbstdn.setSgbstdnCmnrRule11((Integer) obj[80]);
                    Object CmnrRule12 = obj[81];
                    if (CmnrRule12 == null) {
                        CmnrRule12 = 0;
                    }
                    Integer objCmnrRule12 = (Integer) CmnrRule12;
                    sgbstdn.setSgbstdnCmnrRule12(objCmnrRule12);
                    Object CmjrRule21 = obj[82];
                    if (CmjrRule21 == null) {
                        CmjrRule21 = 0;
                    }
                    Integer objCmjrRule21 = (Integer) CmjrRule21;
                    sgbstdn.setSgbstdnCmjrRule21(objCmjrRule21);
                    sgbstdn.setSgbstdnCconRule211((Integer) obj[83]);
                    sgbstdn.setSgbstdnCconRule212((Integer) obj[84]);
                    sgbstdn.setSgbstdnCconRule213((Integer) obj[85]);
                    sgbstdn.setSgbstdnCmjrRule22((Integer) obj[86]);
                    sgbstdn.setSgbstdnCconRule221((Integer) obj[87]);
                    sgbstdn.setSgbstdnCconRule222((Integer) obj[88]);
                    sgbstdn.setSgbstdnCconRule223((Integer) obj[89]);
                    sgbstdn.setSgbstdnCmnrRule21((Integer) obj[90]);
                    sgbstdn.setSgbstdnCmnrRule22((Integer) obj[91]);
                    sgbstdn.setSgbstdnPrevCode((String) obj[92]);
                    sgbstdn.setSgbstdnTermCodePrev((String) obj[93]);
                    sgbstdn.setSgbstdnCastCode((String) obj[94]);
                    sgbstdn.setSgbstdnTermCodeCast((String) obj[95]);
                    sgbstdn.setSgbstdnDataOrigin((String) obj[96]);
                    sgbstdn.setSgbstdnUserId((String) obj[97]);
                    sgbstdnlist.add(sgbstdn);
                }
            } else {
                sgbstdnlist = null;
            }

        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }
        return sgbstdnlist;
    }

}
