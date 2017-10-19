/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.test.hib;

import ec.edu.espe.saturn.controller.GoremalController;
import ec.edu.espe.saturn.controller.PebemplController;
import ec.edu.espe.saturn.controller.SfrstcrController;
import ec.edu.espe.saturn.controller.SgbstdnController;
import ec.edu.espe.saturn.controller.SpraddrController;
import ec.edu.espe.saturn.model.Goremal;
import ec.edu.espe.saturn.model.Pebempl;
import ec.edu.espe.saturn.model.Sfrstcr;
import ec.edu.espe.saturn.model.Sgbstdn;
import ec.edu.espe.saturn.model.Spraddr;
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
        // TODO code application logic here
        List<Goremal> list = GoremalController.FindByPIDM(775);
        System.out.println(">> " + list.size());
        for (Goremal gmail : list) {
            System.out.println(">> " + gmail.toString());
        }

        List<Sgbstdn> sgbslist = SgbstdnController.FindByPIDM(331906);
        System.out.println(">> " + sgbslist.size());
        //depuracion
        
//        List<Pebempl> PebemplList = PebemplController.FindByPIDM(12630);
//        System.out.println(">> "+PebemplList.size());
//        for(Pebempl peml : PebemplList){
//            System.out.println(">> "+peml.toString());
//        }
        
        Sfrstcr SfrstcrLits = SfrstcrController.findByPidem(755);
        System.out.println(">> "+SfrstcrLits.getStvcamp().getStvcampCode());
        
        List<Spraddr> spraddrslist = SpraddrController.FindByPIDM(755);
        System.out.println(">> "+spraddrslist.size());
        for(Spraddr addr : spraddrslist){
            System.out.println(">> "+addr.toString());
        }
        
    }

}
