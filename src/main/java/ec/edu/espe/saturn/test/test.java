/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.test;

import ec.edu.espe.saturn.controller.GoremalController;
import ec.edu.espe.saturn.controller.PebemplController;
import ec.edu.espe.saturn.controller.SfrstcrController;

import ec.edu.espe.saturn.controller.SgbstdnController;
import ec.edu.espe.saturn.controller.SmrprleController;
import ec.edu.espe.saturn.controller.SpbpersController;
import ec.edu.espe.saturn.controller.SpraddrController;
import ec.edu.espe.saturn.controller.SpridenController;
import ec.edu.espe.saturn.controller.SprteleController;
import ec.edu.espe.saturn.controller.StvcampController;
import ec.edu.espe.saturn.controller.StvcollController;

import ec.edu.espe.saturn.model.Goremal;
import ec.edu.espe.saturn.model.Pebempl;
import ec.edu.espe.saturn.model.Sfrstcr;
import ec.edu.espe.saturn.model.Sgbstdn;
import ec.edu.espe.saturn.model.Smrprle;
import ec.edu.espe.saturn.model.Spbpers;
import ec.edu.espe.saturn.model.Spraddr;
import ec.edu.espe.saturn.model.Spriden;
import ec.edu.espe.saturn.model.Sprtele;
import ec.edu.espe.saturn.model.Stvcamp;
import ec.edu.espe.saturn.model.Stvcoll;
import java.util.List;

/**
 *
 * @author luis
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // clase spriden PIDM "SpridenPidm", PRIMER NOMBRE "SpridenFirstName", APELLIDO "SpridenLastName"
        Spriden objsprinden = SpridenController.FindByPIDM(331906);
        System.out.println("SPRIDEN>> " + objsprinden.getId().getSpridenPidm() + " " + objsprinden.getId().getSpridenFirstName() + " " + objsprinden.getId().getSpridenLastName());

        // clase spbpers CEDULA "SpbpersSsn", SEXO "SpbpersSex ", USER_ID "SpbpersUserId", FECHA DE NACIMINETO "SpbpersBirthDate"
        Spbpers objspbpers = SpbpersController.FindByPIDM(331906);
        System.out.println("SPBPERS>> " +objspbpers.getSpbpersSsn() + " " + objspbpers.getSpbpersSex() + " " + objspbpers.getSpbpersUserId() + " " + objspbpers.getSpbpersBirthDate());

        //clase Goremal EMAIL(EMAIL "GoremalEmailAddress")
        List<Goremal> objgoremal = GoremalController.FindByPIDM(331906);
        for (Goremal email : objgoremal) {
            System.out.println(" GOREMAL>> "+ email.getId().getGoremalEmailAddress());

        }

        //clase sprtele TELEFONO( AREA "SprtelePhoneArea", EXTENCIÓN "SprtelePhoneExt", NÚMERO DE TELEFONO "SprtelePhoneNumber")
        List<Sprtele> objsprtele = SprteleController.FindByPIDM(331906);
        for (Sprtele telefono : objsprtele) {
            System.out.println("SRPETELE>> "+ telefono.getSprtelePhoneArea() + " " + telefono.getSprtelePhoneExt() + " " + telefono.getSprtelePhoneNumber());
        }

        //clase spraddr DIRECCIÓN( NÚMERO DE CASA "SpraddrHouseNumber", CALLE PRINCIPAL "SpraddrStreetLine1", CALLE SECUNDARIA "SpraddrStreetLine2()", BARRIO "SpraddrStreetLine3", CIUDAD "SpraddrCity")
        List<Spraddr> objspraddr = SpraddrController.FindByPIDM(331906);
        for (Spraddr direccion : objspraddr) {
            System.out.println("SPRADDR>> "+ direccion.getId().getSpraddrHouseNumber() + " "
                    + direccion.getId().getSpraddrStreetLine1() + " " + direccion.getId().getSpraddrStreetLine2() + " " + direccion.getId().getSpraddrStreetLine3()+" "+direccion.getId().getSpraddrCity());
        }
        
        // clase Smrprle PROGRAMA "SmrprleProgram"
        List<Smrprle> objsmrprle = SmrprleController.ListSmrprle();
        for (Smrprle smrprle : objsmrprle) {
            System.out.println("SMRPRLE>> " + smrprle.getSmrprleProgram());
        }
        /*LA SMRPRLE SMRPRLE_PROGRAM NECESITA LA SGBSTDN_PROGRAM_2*/
        
        //clase stvcoll 
        Stvcoll objstvcoll = StvcollController.HFindByCODE("99");
        System.out.println("STVCOLL>> " + objstvcoll.getStvcollCode() + " " + objstvcoll.getStvcollDesc());

        //clase stvcamp
        Stvcamp objstvcamp = StvcampController.HFindByCODE("10");
        System.out.println(" STVCAMP>> " + objstvcamp.getStvcampCode() + " " + objstvcamp.getStvcampDesc());

        //clase pebempl (CODIGO DEL CAMPUS "PebemplCampCode", NOMBRE DEL CAMPUS "PebemplJblnCode", CODIDO DE LOCALIZACIÓN "PebemplLcatCode") 
        List<Pebempl> objpebempl = PebemplController.FindByPIDM(12630);
        for (Pebempl peml : objpebempl) {
            System.out.println("PEBEMPL>> " + peml.getPebemplCampCode()+" "+peml.getPebemplJblnCode()+" "+peml.getPebemplLcatCode());
        }
        
        //clase Sfrstcr (PERIODO "SfrstcrTermCode")
           Sfrstcr periodo = SfrstcrController.findByPidem(331906);
           System.out.println("Sfrstcr>> "+periodo.getId().getSfrstcrTermCode()); 
        
//         Sgbstdn objSgbstdn = SgbstdnController.FindByPIDM_H(331906);
//           System.out.println("SGBSTDN>> " + objSgbstdn.getSmrprleBySgbstdnProgram2() + " " + objSgbstdn.getStvcampBySgbstdnCampCode());
    }

}
