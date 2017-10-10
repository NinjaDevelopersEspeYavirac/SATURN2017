/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saturn.test;

import ec.edu.espe.saturn.controller.SpbpersController;
import ec.edu.espe.saturn.model.Spbpers;

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
        Spbpers obj = SpbpersController.FindByCedula("1804110474");
        System.out.println(">> "+obj.toString());
    }
    
}
