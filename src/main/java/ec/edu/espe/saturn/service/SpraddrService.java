/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.dao.DAOServices;
import ec.edu.espe.saturn.dao.QueryParameter;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Spraddr;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Gabriel-PC
 */
public class SpraddrService {

    private final static L log = new L(SpraddrService.class);

    public static List<Spraddr> FindByPIDM(int spraddrPidm) {
        List<Spraddr> spraddrlist = new ArrayList<>();

        try {
            String sql = "SELECT * FROM SATUR.SPRADDR WHERE SPRADDR_PIDM = " + spraddrPidm;
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {
                    Spraddr spraddr = new Spraddr();
                    BigDecimal pidm = null;
                    pidm = (BigDecimal) obj[0];
                    spraddr.getId().setSpraddrPidm((int) pidm.intValue());
                    spraddr.getId().setSpraddrAtypCode((String) obj[1]);
                    Object ssbyte = obj[2];
                    String objbyte = ssbyte.toString();
                    spraddr.getId().setSpraddrSeqno(Byte.parseByte(objbyte));
                    spraddr.getId().setSpraddrFromDate((Date) obj[3]);
                    spraddr.getId().setSpraddrToDate((Date) obj[4]);
                    spraddr.getId().setSpraddrStreetLine1((String) obj[5]);
                    spraddr.getId().setSpraddrStreetLine2((String) obj[6]);
                    spraddr.getId().setSpraddrStreetLine3((String) obj[7]);
                    spraddr.getId().setSpraddrCity((String) obj[8]);
                    spraddr.getId().setSpraddrStatCode((String) obj[9]);
                    spraddr.getId().setSpraddrZip((String) obj[10]);
                    spraddr.getId().setSpraddrCntyCode((String) obj[11]);
                    spraddr.getId().setSpraddrNatnCode((String) obj[12]);
                    spraddr.getId().setSpraddrPhoneArea((String) obj[13]);
                    spraddr.getId().setSpraddrPhoneNumber((String) obj[14]);
                    spraddr.getId().setSpraddrPhoneExt((String) obj[15]);
                    spraddr.getId().setSpraddrStatusInd((String) obj[16]);
                    spraddr.getId().setSpraddrActivityDate((Date) obj[17]);
                    spraddr.getId().setSpraddrUser((String) obj[18]);
                    spraddr.getId().setSpraddrAsrcCode((String) obj[19]);
                    spraddr.getId().setSpraddrDeliveryPoint((Byte) obj[20]);
                    spraddr.getId().setSpraddrCorrectionDigit((Boolean) obj[21]);
                    spraddr.getId().setSpraddrCarrierRoute((String) obj[22]);
                    spraddr.getId().setSpraddrGstTaxId((String) obj[23]);
                    spraddr.getId().setSpraddrReviewedInd((String) obj[24]);
                    spraddr.getId().setSpraddrReviewedUser((String) obj[25]);
                    spraddr.getId().setSpraddrDataOrigin((String) obj[26]);
                    spraddr.getId().setSpraddrCtryCodePhone((String) obj[27]);
                    spraddr.getId().setSpraddrHouseNumber((String) obj[28]);
                    spraddr.getId().setSpraddrStreetLine4((String) obj[29]);
                    spraddrlist.add(spraddr);
                }
            } else {
                spraddrlist = null;
            }

        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }

        return spraddrlist;
    }

    public static List<Spraddr> findByPIDM(int spbpersPidm) {
        List<Spraddr> findmSpraddr = null;
        try {
            DAOServices ds = new DAOServices(HibernateUtil.
                    getSessionFactory().getCurrentSession());
            QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
            query_1.setColumnName("id.spraddrPidm");
            query_1.setWhereClause("=");
            query_1.setValue(spbpersPidm);
            List parameList = new ArrayList();
            parameList.add(query_1);
            List< Spraddr> listClients = ds.customQuery(parameList, Spraddr.class);
            if (!listClients.isEmpty()) {
                findmSpraddr = listClients;
            }
        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }

        return findmSpraddr;
    }
}
