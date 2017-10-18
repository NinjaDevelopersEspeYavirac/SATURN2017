/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.dao.QueryParameter;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Sfrstcr;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Pcmaster2
 */
public class SfrstcrService {

    private final static L log = new L(SpridenService.class);

    public static List<Sfrstcr> FindBypidem(int sfrstcrPidm) {
        Sfrstcr sfrstcr = new Sfrstcr();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String stringdata = "1900-09-03";
        List<Sfrstcr> sfrstcrlist = new ArrayList<Sfrstcr>();
        try {
            String sql = "SELECT * FROM SATURN.SFRSTCR WHERE SFRSTCR_PIDM=" + sfrstcrPidm;
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {
                    sfrstcr.getId().setSfrstcrTermCode((String) obj[0]);
                    BigDecimal pidm = null;
                    pidm = (BigDecimal) obj[1];
                    sfrstcr.getId().setSfrstcrPidm((int) pidm.intValue());
                    sfrstcr.getId().setSfrstcrCrn((String) obj[2]);
                    Object sshort = obj[3];
                    if (sshort == null) {
                        sshort = 0;
                    }
                    String objshort = sshort.toString();
                    sfrstcr.setSfrstcrClassSortKey(Short.parseShort(objshort));
                    Object sshortt = obj[4];
                    if (sshortt == null) {
                        sshortt = 0;
                    }
                    String objshortt = sshortt.toString();
                    sfrstcr.setSfrstcrRegSeq(Short.parseShort(objshortt));
                    sfrstcr.setSfrstcrPtrmCode((String) obj[5]);
                    sfrstcr.setSfrstcrRstsCode((String) obj[6]);
                    sfrstcr.setSfrstcrRstsDate((Date) obj[7]);
                    sfrstcr.setSfrstcrErrorFlag((String) obj[8]);
                    sfrstcr.setSfrstcrMessage((String) obj[9]);
                    sfrstcr.setSfrstcrBillHr((BigDecimal) obj[10]);
                    sfrstcr.setSfrstcrWaivHr((BigDecimal) obj[11]);
                    sfrstcr.setSfrstcrCreditHr((BigDecimal) obj[12]);
                    sfrstcr.setSfrstcrBillHrHold((BigDecimal) obj[13]);
                    sfrstcr.setSfrstcrCreditHrHold((BigDecimal) obj[14]);
                    sfrstcr.setSfrstcrGmodCode((String) obj[15]);
                    sfrstcr.setSfrstcrGrdeCode((String) obj[16]);
                    sfrstcr.setSfrstcrGrdeCodeMid((String) obj[17]);
                    sfrstcr.setSfrstcrGrdeDate((Date) obj[18]);
                    sfrstcr.setSfrstcrDuplOver((String) obj[19]);
                    sfrstcr.setSfrstcrLinkOver((String) obj[20]);
                    sfrstcr.setSfrstcrCorqOver((String) obj[21]);
                    sfrstcr.setSfrstcrPreqOver((String) obj[22]);
                    sfrstcr.setSfrstcrTimeOver((String) obj[23]);
                    sfrstcr.setSfrstcrCapcOver((String) obj[24]);
                    sfrstcr.setSfrstcrLevlOver((String) obj[25]);
                    sfrstcr.setSfrstcrCollOver((String) obj[26]);
                    sfrstcr.setSfrstcrMajrOver((String) obj[27]);
                    sfrstcr.setSfrstcrClasOver((String) obj[28]);
                    sfrstcr.setSfrstcrApprOver((String) obj[29]);
                    sfrstcr.setSfrstcrApprReceivedInd((String) obj[30]);
                    sfrstcr.setSfrstcrAddDate((Date) obj[31]);
                    sfrstcr.setSfrstcrActivityDate((Date) obj[32]);
                    sfrstcr.setSfrstcrLevlCode((String) obj[33]);
                    sfrstcr.setSfrstcrReservedKey((String) obj[34]);
                    sfrstcr.setSfrstcrAttendHr((BigDecimal) obj[35]);
                    sfrstcr.setSfrstcrReptOver((String) obj[36]);
                    sfrstcr.setSfrstcrRpthOver((String) obj[37]);
                    sfrstcr.setSfrstcrTestOver((String) obj[38]);
                    sfrstcr.setSfrstcrCampOver((String) obj[39]);
                    sfrstcr.setSfrstcrUser((String) obj[40]);
                    sfrstcr.setSfrstcrDegcOver((String) obj[41]);
                    sfrstcr.setSfrstcrProgOver((String) obj[42]);
                    Object Dates = obj[43];
                    if (Dates == null || Dates.equals("N")) {
                        Dates = "1900-09-03";
                        try {
                            Date datess = formatter.parse(stringdata);
                            sfrstcr.setSfrstcrLastAttend(datess);
                        } catch (Exception e) {
                            log.level.info("Error Fecha : " + e.getMessage());
                        }
                    } else {
                        sfrstcr.setSfrstcrLastAttend((Date) Dates);
                    }
                    sfrstcr.setSfrstcrGcmtCode((String) obj[44]);
                    sfrstcr.setSfrstcrDataOrigin((String) obj[45]);
                    sfrstcr.setSfrstcrAssessActivityDate((Date) obj[46]);
                    Object dat = obj[47];
                    sfrstcr.setSfrstcrDeptOver((String) dat.toString());
                    sfrstcr.setSfrstcrAttsOver((String) obj[48]);
                    sfrstcr.setSfrstcrChrtOver((String) obj[49]);
                    sfrstcr.setSfrstcrRmsgCde((String) obj[50]);
                    Object big = obj[51];
                    if (big == null) {
                        BigDecimal bign = new BigDecimal(0);
                        sfrstcr.setSfrstcrWlPriority((BigDecimal) bign);
                    } else {
                        sfrstcr.setSfrstcrWlPriority((BigDecimal) big);
                    }
                    sfrstcr.setSfrstcrWlPriorityOrig((String) obj[52]);
                    sfrstcr.setSfrstcrGrdeCodeIncmpFinal((String) obj[53]);
                    Object Datess = obj[54];
                    if (Datess == null) {
                        Datess = "1900-09-03";
                        try {
                            Date dateess = formatter.parse(stringdata);
                            sfrstcr.setSfrstcrIncompleteExtDate(dateess);
                        } catch (Exception e) {
                            log.level.info("Error Fecha : " + e.getMessage());
                        }
                    } else {
                        sfrstcr.setSfrstcrIncompleteExtDate((Date) Datess);
                    }
                    sfrstcrlist.add(sfrstcr);
                }
            } else {
                sfrstcrlist = null;
            }

        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }

        return sfrstcrlist;
    }

    public static Sfrstcr findByPidem(int sfrstcrPidm) {
        Sfrstcr findmSfrstcr = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                    getSessionFactory().getCurrentSession());
            QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
            query_1.setColumnName("id.sfrstcrPidm");
            query_1.setWhereClause("=");
            query_1.setValue(sfrstcrPidm);
            List parameList = new ArrayList();
            parameList.add(query_1);
            List<Sfrstcr> listClients = ds.customQuery(parameList, Sfrstcr.class);
            if (!listClients.isEmpty()) {
                int item = listClients.size();
                findmSfrstcr = listClients.get(item - 1);
            }
        } catch (HibernateException ex) {
            log.level.info("HFindByPidem : " + ex.getMessage());
        }

        return findmSfrstcr;
    }
}
