/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.test;

import ec.edu.espe.saturn.controller.GoremalController;
import ec.edu.espe.saturn.controller.PebemplController;

import ec.edu.espe.saturn.controller.SgbstdnController;
import ec.edu.espe.saturn.controller.SpbpersController;
import ec.edu.espe.saturn.controller.SpraddrController;
import ec.edu.espe.saturn.controller.SprteleController;
import ec.edu.espe.saturn.controller.StvcampController;
import ec.edu.espe.saturn.controller.StvcollController;

import ec.edu.espe.saturn.model.Goremal;
import ec.edu.espe.saturn.model.Pebempl;
import ec.edu.espe.saturn.model.Sfrstcr;
import ec.edu.espe.saturn.model.Sgbstdn;
import ec.edu.espe.saturn.model.Spbpers;
import ec.edu.espe.saturn.model.Spraddr;
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

        // CLASE SPRTELE (TELEFONO)
        /*List<Sprtele> objg = SprteleController.FindByPIDM(664);
        for (Sprtele telefono : objg) {

            System.out.println(">> " + telefono.toString());

        }*/
        //ClASE GOREMAL (E-MAIL)
       
//        List<Goremal> objg = GoremalController.FindByPIDM(357353);
//        for (Goremal gmail : objg) {
//
//            System.out.println(">> " + gmail.toString());
//        }
        
        // CLASE SPRADDR (DIRECCION)
//        List<Spraddr> objg2 = SpraddrController.FindByPIDM(1116);
//        for (Spraddr direccion : objg2) {
//           System.out.println(">> " + direccion.toString());
//        }
        
        //CLASE STVCOLL
//        List<Stvcoll> obj = StvcollController.FindByCode("99");
//        for (Stvcoll carrera: obj) {
//            System.out.println(">>"+carrera.toString());
//        }
        //CLASE STVCAMP
//        List<Stvcamp> obj = StvcampController.FindByCode("01");
//        System.out.println(">>"+obj.toString());

        //ClASE PEBEMPLCONTROLLER (CAMPUS)    
//        List<Pebempl> obj = PebemplController.FindByPIDM(16992);
//        for (Pebempl telefono : obj) {
//        System.out.println(">>"+obj.toString());
//        }
         
        //CLASE SGBSTDN
        //QUERY NATIVO
//      Sgbstdn objsg = SgbstdnController.FindByPIDM_H(2889);
//           System.out.println(">>"+objsg.toString());
        //QUERY HIBERNATE
        List<Sgbstdn> objsg = SgbstdnController.FindByPIDM(2889);
            System.out.println(">>"+objsg.toString());
      
        



    }
    
}
