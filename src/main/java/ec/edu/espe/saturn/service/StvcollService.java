/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Stvcoll;
import ec.edu.espe.saturn.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author marlo
 */
public class StvcollService {
    private final static L log = new L(StvcampService.class);

    public static List<Stvcoll> FindByCode(String stvcollCode) {
        Stvcoll stvcoll = new Stvcoll();
        List<Stvcoll> stvcolllist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM SATURN.STVCOLL WHERE STVCOLL_CODE = '" + stvcollCode + "'";
            List<Object[]> list = HibernateUtil.
                    getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
            if (!list.isEmpty()) {
                for (Object[] obj : list) {

                    stvcoll.setStvcollCode((String) obj[0]);
                    stvcoll.setStvcollDesc((String) obj[1]);
                    stvcoll.setStvcollAddrStreetLine1((String) obj[2]);
                    stvcoll.setStvcollAddrStreetLine2((String) obj[3]);
                    stvcoll.setStvcollAddrStreetLine3((String) obj[4]);
                    stvcoll.setStvcollAddrCity((String) obj[5]);
                    stvcoll.setStvcollAddrState((String) obj[6]);
                    stvcoll.setStvcollAddrCountry((String) obj[7]);
                    stvcoll.setStvcollAddrZipCode((String) obj[8]);
                    stvcoll.setStvcollActivityDate((Date) obj[9]);
                    stvcoll.setStvcollSystemReqInd((String) obj[10]);
                    Object inte=obj[11];
                    if(inte ==null)inte=0;
                    String objint = inte.toString();
                    stvcoll.setStvcollVrMsgNo(Integer.parseInt(objint));
                    stvcoll.setStvcollStatscanCde3((String) obj[12]);
                    stvcoll.setStvcollDicdCode((String) obj[13]);
                    stvcoll.setStvcollHouseNumber((String) obj[14]);
                    stvcoll.setStvcollAddrStreetLine4((String) obj[15]);
                    
                    stvcolllist.add(stvcoll);
                }
            } else {
                stvcolllist = null;
            }

        } catch (HibernateException ex) {
            log.level.info("FindByCode : " + ex.getMessage());
        }

        return stvcolllist;
    }

}
