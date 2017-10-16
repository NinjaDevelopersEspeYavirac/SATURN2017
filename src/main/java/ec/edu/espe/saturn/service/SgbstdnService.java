/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.service;

import ec.edu.espe.saturn.logger.L;
import ec.edu.espe.saturn.model.Sgbstdn;
import ec.edu.espe.saturn.model.Sgbstdn;
import ec.edu.espe.saturn.model.Smrprle;
import ec.edu.espe.saturn.model.Sobcurr;
import ec.edu.espe.saturn.model.Stvcamp;
import ec.edu.espe.saturn.model.Stvcoll;
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
public class SgbstdnService {

    private final static L log = new L(SgbstdnService.class);

    public static List<Sgbstdn> FindByPIDM(int sgbstdnPidm) {
        int Vacio = 1;
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
//                    sgbstdn.setSobcurrBySgbstdnCurrRule1((Sobcurr) obj[5]);//Sobcurr
//                    sgbstdn.setStvcampBySgbstdnCampCode2((Stvcamp) obj[6]);//Stvcamp
//                    sgbstdn.setStvcampBySgbstdnCampCode((Stvcamp) obj[7]);//Stvcamp
//                    sgbstdn.setStvcollBySgbstdnCollCode2((Stvcoll) obj[8]);//Stvcoll
//                    sgbstdn.setStvcollBySgbstdnCollCode1((Stvcoll) obj[9]);//Stvcoll
//                    sgbstdn.setStvcollBySgbstdnCollCodeDual((Stvcoll) obj[10]);//Stvcoll
                    sgbstdn.setSgbstdnStstCode((String) obj[11]);
                    sgbstdn.setSgbstdnLevlCode((String) obj[12]);
                    sgbstdn.setSgbstdnStypCode((String) obj[13]);
                    sgbstdn.setSgbstdnTermCodeMatric((String) obj[14]);
                    sgbstdn.setSgbstdnTermCodeAdmit((String) obj[15]);
                    sgbstdn.setSgbstdnExpGradDate((Date) obj[16]);
                    sgbstdn.setSgbstdnFullPartInd((String) obj[17]);
                    sgbstdn.setSgbstdnSessCode((String) obj[18]);
                    sgbstdn.setSgbstdnResdCode((String) obj[19]);
                    sgbstdn.setSgbstdnDegcCode1((String) obj[20]);
                    sgbstdn.setSgbstdnMajrCode1((String) obj[21]);
                    sgbstdn.setSgbstdnMajrCodeMinr1((String) obj[22]);
                    sgbstdn.setSgbstdnMajrCodeMinr12((String) obj[23]);
                    sgbstdn.setSgbstdnMajrCodeConc1((String) obj[24]);
                    sgbstdn.setSgbstdnMajrCodeConc12((String) obj[25]);
                    sgbstdn.setSgbstdnMajrCodeConc13((String) obj[26]);
                    sgbstdn.setSgbstdnDegcCode2((String) obj[27]);
                    sgbstdn.setSgbstdnMajrCode2((String) obj[28]);
                    sgbstdn.setSgbstdnMajrCodeMinr2((String) obj[29]);
                    sgbstdn.setSgbstdnMajrCodeMinr22((String) obj[30]);
                    sgbstdn.setSgbstdnMajrCodeConc2((String) obj[31]);
                    sgbstdn.setSgbstdnMajrCodeConc22((String) obj[32]);
                    sgbstdn.setSgbstdnMajrCodeConc23((String) obj[33]);
                    sgbstdn.setSgbstdnOrsnCode((String) obj[34]);
                    sgbstdn.setSgbstdnPracCode((String) obj[35]);
                    sgbstdn.setSgbstdnAdvrPidm((Integer) obj[36]);
                    sgbstdn.setSgbstdnGradCreditApprInd((String) obj[37]);
                    sgbstdn.setSgbstdnCaplCode((String) obj[38]);
                    sgbstdn.setSgbstdnLeavCode((String) obj[39]);
                    sgbstdn.setSgbstdnLeavFromDate((Date) obj[40]);
                    sgbstdn.setSgbstdnLeavToDate((Date) obj[41]);
                    sgbstdn.setSgbstdnAstdCode((String) obj[42]);
                    sgbstdn.setSgbstdnTermCodeAstd((String) obj[43]);
                    sgbstdn.setSgbstdnRateCode((String) obj[44]);
                    sgbstdn.setSgbstdnActivityDate((Date) obj[45]);
                    sgbstdn.setSgbstdnMajrCode22((String) obj[46]);
                    sgbstdn.setSgbstdnEdlvCode((String) obj[47]);
                    sgbstdn.setSgbstdnIncmCode((String) obj[48]);
                    sgbstdn.setSgbstdnAdmtCode((String) obj[49]);
                    sgbstdn.setSgbstdnEmexCode((String) obj[50]);
                    sgbstdn.setSgbstdnAprnCode((String) obj[51]);
                    sgbstdn.setSgbstdnTrcnCode((String) obj[52]);
                    sgbstdn.setSgbstdnGainCode((String) obj[53]);
                    sgbstdn.setSgbstdnVoedCode((String) obj[54]);
                    sgbstdn.setSgbstdnBlckCode((String) obj[55]);
                    sgbstdn.setSgbstdnTermCodeGrad((String) obj[56]);
                    sgbstdn.setSgbstdnAcyrCode((String) obj[57]);
                    sgbstdn.setSgbstdnDeptCode((String) obj[58]);
                    sgbstdn.setSgbstdnSiteCode((String) obj[59]);
                    sgbstdn.setSgbstdnDeptCode2((String) obj[60]);
                    sgbstdn.setSgbstdnEgolCode((String) obj[61]);
                    sgbstdn.setSgbstdnDegcCodeDual((String) obj[62]);
                    sgbstdn.setSgbstdnLevlCodeDual((String) obj[63]);
                    sgbstdn.setSgbstdnDeptCodeDual((String) obj[64]);
                    sgbstdn.setSgbstdnMajrCodeDual((String) obj[65]);
                    sgbstdn.setSgbstdnBsklCode((String) obj[66]);
                    sgbstdn.setSgbstdnPrimRollInd((String) obj[67]);
                    sgbstdn.setSgbstdnTermCodeCtlg1((String) obj[68]);
                    sgbstdn.setSgbstdnDeptCode12((String) obj[69]);
                    sgbstdn.setSgbstdnMajrCodeConc121((String) obj[70]);
                    sgbstdn.setSgbstdnMajrCodeConc122((String) obj[71]);
                    sgbstdn.setSgbstdnMajrCodeConc123((String) obj[72]);
                    sgbstdn.setSgbstdnSecdRollInd((String) obj[73]);
                    sgbstdn.setSgbstdnTermCodeAdmit2((String) obj[74]);
                    sgbstdn.setSgbstdnAdmtCode2((String) obj[75]);
                    sgbstdn.setSgbstdnTermCodeCtlg2((String) obj[76]);
                    sgbstdn.setSgbstdnLevlCode2((String) obj[77]);
                    sgbstdn.setSgbstdnDeptCode22((String) obj[78]);
                    sgbstdn.setSgbstdnMajrCodeConc221((String) obj[79]);
                    sgbstdn.setSgbstdnMajrCodeConc222((String) obj[80]);
                    sgbstdn.setSgbstdnMajrCodeConc223((String) obj[81]);
                    sgbstdn.setSgbstdnCmjrRule11((Integer) obj[82]);
                    sgbstdn.setSgbstdnCconRule111((Integer) obj[83]);
                    sgbstdn.setSgbstdnCconRule112((Integer) obj[84]);
                    sgbstdn.setSgbstdnCconRule113((Integer) obj[85]);
                    sgbstdn.setSgbstdnCmjrRule12((Integer) obj[86]);
                    sgbstdn.setSgbstdnCconRule121((Integer) obj[87]);
                    sgbstdn.setSgbstdnCconRule122((Integer) obj[88]);
                    sgbstdn.setSgbstdnCconRule123((Integer) obj[89]);
                    sgbstdn.setSgbstdnCmnrRule11((Integer) obj[90]);
                    sgbstdn.setSgbstdnCmnrRule12((Integer) obj[91]);
                    sgbstdn.setSgbstdnCmjrRule21((Integer) obj[92]);
                    sgbstdn.setSgbstdnCconRule211((Integer) obj[93]);
                    sgbstdn.setSgbstdnCconRule212((Integer) obj[94]);
                    sgbstdn.setSgbstdnCconRule213((Integer) obj[95]);
                    sgbstdn.setSgbstdnCmjrRule22((Integer) obj[96]);
                    sgbstdn.setSgbstdnCconRule221((Integer) obj[97]);
                    sgbstdn.setSgbstdnCconRule222((Integer) obj[98]);
                    sgbstdn.setSgbstdnCconRule223((Integer) obj[99]);
                    sgbstdn.setSgbstdnCmnrRule21((Integer) obj[100]);
                    sgbstdn.setSgbstdnCmnrRule22((Integer) obj[101]);
                    sgbstdn.setSgbstdnPrevCode((String) obj[102]);
                    sgbstdn.setSgbstdnTermCodePrev((String) obj[103]);
                    sgbstdn.setSgbstdnCastCode((String) obj[104]);
                    sgbstdn.setSgbstdnTermCodeCast((String) obj[105]);
                    sgbstdn.setSgbstdnDataOrigin((String) obj[106]);
                    sgbstdn.setSgbstdnUserId((String) obj[107]);
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
