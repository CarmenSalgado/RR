/**
*
* Clase: Test
*
* @class Expression class is undefined on line 5, column 12 in Templates/Classes/Class.java.
*
* versión:0.1
*
* fecha Creación: 6/03/2020
*
* fecha Modificación: 6/03/2020
*
* Autor: Carmen Salgado...
*
* @author Casalg
* 
* Copyright: CECAR
*
**/

package edu.cecar.test;

import edu.cecar.vista.GuiPrincipal;
import edu.cecar.componentesInterfaces.InterfaceDAO;
import edu.cecar.componentesReutilizables.*;
import edu.cecar.controlador.*;

/**
*
* ESTA CLASE PERMITE HACER TESTING AL APP...
*
**/

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        // TODO code application logic here

        System.out.println("OK... WELL!!");
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new GuiPrincipal().setVisible(true);
                }
            });

    }

}
