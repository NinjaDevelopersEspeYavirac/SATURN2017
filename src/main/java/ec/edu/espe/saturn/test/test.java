/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.test;

import ec.edu.espe.saturn.controller.GoremalController;
import ec.edu.espe.saturn.controller.NbrjobsController;
import ec.edu.espe.saturn.controller.PebemplController;
import ec.edu.espe.saturn.controller.PerapptController;
import ec.edu.espe.saturn.controller.PtrtenrController;
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
import ec.edu.espe.saturn.model.Nbrjobs;
import ec.edu.espe.saturn.model.Pebempl;
import ec.edu.espe.saturn.model.Perappt;
import ec.edu.espe.saturn.model.Ptrtenr;
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
//
//        // clase spriden PIDM "SpridenPidm", PRIMER NOMBRE "SpridenFirstName", APELLIDO "SpridenLastName"
//        Spriden objsprinden = SpridenController.FindByPIDM(331906);
//        System.out.println("SPRIDEN>> " + " PIDM: " + objsprinden.getId().getSpridenPidm() + " PRIMER NOMBRE: " + objsprinden.getId().getSpridenFirstName() + " APELLIDO: " + objsprinden.getId().getSpridenLastName());
//  
//        // clase spbpers CEDULA "SpbpersSsn", SEXO "SpbpersSex ", USER_ID "SpbpersUserId", FECHA DE NACIMINETO "SpbpersBirthDate"
//        Spbpers objspbpers = SpbpersController.FindByPIDM(331906);
//        System.out.println("SPBPERS>> " + " CEDULA: " + objspbpers.getSpbpersSsn() + " SEXO: " + objspbpers.getSpbpersSex() + " USER_ID: " + objspbpers.getSpbpersUserId() + " FECHA DE NACIMINETO: " + objspbpers.getSpbpersBirthDate());
//
//        //clase Goremal EMAIL(EMAIL "GoremalEmailAddress")
//        List<Goremal> objgoremal = GoremalController.FindByPIDM(331906);
//        for (Goremal email : objgoremal) {
//            System.out.println(" GOREMAL>> " + " EMAIL: " + email.getId().getGoremalEmailAddress());
//
//        }
//
//        //clase sprtele TELEFONO( AREA "SprtelePhoneArea", EXTENCIÓN "SprtelePhoneExt", NÚMERO DE TELEFONO "SprtelePhoneNumber")
//        List<Sprtele> objsprtele = SprteleController.FindByPIDM(331906);
//        for (Sprtele telefono : objsprtele) {
//            System.out.println("SRPETELE>> " + " AREA: " + telefono.getSprtelePhoneArea() + " EXTENCIÓN: " + telefono.getSprtelePhoneExt() + " NÚMERO DE TELEFONO: " + telefono.getSprtelePhoneNumber());
//        }
//
//        //clase spraddr DIRECCIÓN( NÚMERO DE CASA "SpraddrHouseNumber", CALLE PRINCIPAL "SpraddrStreetLine1", CALLE SECUNDARIA "SpraddrStreetLine2()", BARRIO "SpraddrStreetLine3", CIUDAD "SpraddrCity")
//        List<Spraddr> objspraddr = SpraddrController.FindByPIDM(331906);
//        for (Spraddr direccion : objspraddr) {
//            System.out.println("SPRADDR>> " + " NÚMERO DE CASA: " + direccion.getId().getSpraddrHouseNumber() + " CALLE PRINCIPAL: "
//                    + direccion.getId().getSpraddrStreetLine1() + " CALLE SECUNDARIA: " + direccion.getId().getSpraddrStreetLine2() + " BARRIO: " + direccion.getId().getSpraddrStreetLine3() + "  CIUDAD: " + direccion.getId().getSpraddrCity());
//        }
//
        // clase Smrprle PROGRAMA "SmrprleProgram"
//        List<Smrprle> objsmrprle = SmrprleController.ListSmrprle();
//        for (Smrprle smrprle : objsmrprle) {
//            System.out.println("SMRPRLE>> " + "PROGRAMA: " + smrprle.getSmrprleProgram());
//        }
//        //LA SMRPRLE SMRPRLE_PROGRAM NECESITA LA SGBSTDN_PROGRAM_2
//
//        //clase Sfrstcr (PERIODO "SfrstcrTermCode")
//        Sfrstcr periodo = SfrstcrController.findByPidem(331906);
//        System.out.println("Sfrstcr>> " + " PERIODO: " + periodo.getId().getSfrstcrTermCode());
//
//        //clase pebempl (CODIGO DEL CAMPUS "PebemplCampCode", NOMBRE DEL CAMPUS "PebemplJblnCode", CODIDO DE LOCALIZACIÓN "PebemplLcatCode") 
//        Pebempl objpebempl = PebemplController.FindByPIDM_H(7714);
//        System.out.println("PEBEMPL>> " + "CODIGO DEL DEPARTAMENTO: " + objpebempl.getPebemplCampCode() + " CODIGO DE DEPARTAMENTO: " + objpebempl.getPebemplCollCode() + " CODIDO DE LOCALIZACIÓN: " + objpebempl.getPebemplLcatCode());
//        String departamento = objpebempl.getPebemplCollCode();
//
//        //clase stvcoll DEPARTAMENTO INGENIEROS
//        Stvcoll objstvcoll = StvcollController.HFindByCODE(departamento);
//        System.out.println("STVCOLL>> " + " CODIGO: " + objstvcoll.getStvcollCode() + "DESCRIPCIÓN: " + objstvcoll.getStvcollDesc());
//        
//        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
////        //clase sgbstdn
//        Sgbstdn objSgbstdn = SgbstdnController.FindByPIDM_H(331906);
//        System.out.println("SGBSTDN PROGRAMA >> " + objSgbstdn.getSmrprleBySgbstdnProgram2().getSmrprleProgram() + " " + objSgbstdn.getStvcampBySgbstdnCampCode().getStvcampCode());
//        String campo = objSgbstdn.getStvcampBySgbstdnCampCode().getStvcampCode();
//        //clase stvcamp
//        Stvcamp objstvcamp = StvcampController.HFindByCODE(campo);
//        System.out.println(" STVCAMP>> " + " CODIGO: " + objstvcamp.getStvcampCode() + " DESCRIPCION: " + objstvcamp.getStvcampDesc());
//        
        //>>>OBTENER TITULARIDAD
        
        //PTRTENR BUSCAR POR: ptrtenr_code, IMPRIMIR: ptrtenr_code, ptrtenr_desc
         Ptrtenr objptrtenr = PtrtenrController.FindByCode("06");
         System.out.println("PTRTENR>> Nº: " +objptrtenr.getPtrtenrCode()+" DESCRIPCION: "+objptrtenr.getPtrtenrDesc());
 
        
        //NBRJOBS BUSCAR POR: NBRJOBS_pidm, IMPRIMIR: nbrjobs_posn, nbrjobs_pict_code, nbrjobs_effective_date
        List<Nbrjobs> objNbrjobs = NbrjobsController.FindByPIDMNbrjobs(8005);
        for (Nbrjobs jobs : objNbrjobs) {
            System.out.println("NBRJOBS >> " + "PIDM: " + jobs.getId().getNbrjobsPidm() + " POSN: " + jobs.getId().getNbrjobsPosn() + " DESCRIPCION: " + jobs.getNbrjobsDesc() + " ESTATUS: " + jobs.getNbrjobsStatus());
        }

//        //PERAPPT BUSCAR POR: perappt_pidm, IMPRIMIR: perappt_activity_date
//        List<Perappt> objPerappt = PerapptController.FindByPidmPerappt(8005);
//        for (Perappt date : objPerappt) {
//            System.out.println("PERAPPT>> " + date.getId().getPerapptPidm());
//        }ESTE NO FUNCIONA TODAVIA

    }

}
