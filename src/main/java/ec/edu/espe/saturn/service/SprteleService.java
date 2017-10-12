/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import com.mchange.v2.ser.SerializableUtils;
import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Sprtele;
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
public class SprteleService {
    private final static L log = new L(SprteleService.class);
    
    
    public static List<Sprtele> FindByPIDM(int sprtelePidm) {
        int Vacio = 1;
        List<Sprtele> sprtelelist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM SPRTELE WHERE SPRTELE_PIDM=" + sprtelePidm;
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {
                    Sprtele sprtele = new Sprtele();
                    BigDecimal pidm = null;
                    pidm = (BigDecimal) obj[0];
                    sprtele.getId().setSprtelePidm((int) pidm.intValue());
                    Object sshort = obj[1];
                    String objshort = sshort.toString();
                    sprtele.getId().setSprteleSeqno(Short.parseShort(objshort));
                    sprtele.getId().setSprteleTeleCode((String) obj[2]);
                    sprtele.setSprteleActivityDate((Date) obj[3]);
                    sprtele.setSprtelePhoneArea((String) obj[4]);
                    sprtele.setSprtelePhoneNumber((String) obj[5]);
                    sprtele.setSprtelePhoneExt((String) obj[6]);
                    sprtele.setSprteleStatusInd((String) obj[7]);
                    sprtele.setSprteleAtypCode((String) obj[8]);
                    
                    
                    Object ssbyte = obj[9];
                    if(ssbyte == null){
                        ssbyte = Vacio;
                    }
                    String objbyte = ssbyte.toString();
                    sprtele.setSprteleAddrSeqno(Byte.parseByte(objbyte));
                    
                    
                    sprtele.setSprtelePrimaryInd((String) obj[10]);
                    sprtele.setSprteleUnlistInd((String) obj[11]);
                    sprtele.setSprteleComment((String) obj[12]);
                    sprtele.setSprteleIntlAccess((String) obj[13]);
                    sprtele.setSprteleDataOrigin((String) obj[14]);
                    sprtele.setSprteleUserId((String) obj[15]);
                    sprtele.setSprteleCtryCodePhone((String) obj[16]);
                    sprtelelist.add(sprtele);
                }
            } else {
                sprtelelist = null;
            }
            
        } catch (HibernateException ex) {
            log.level.info("FindByPIDM : " + ex.getMessage());
        }
        
        return sprtelelist;
    }
}
