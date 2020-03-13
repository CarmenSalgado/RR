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
import edu.cecar.componentesDAO.DAOInterface;
import edu.cecar.componentesReutilizables.*;
import edu.cecar.controladores.ControladorDAO;
import edu.cecar.controladores.ControladorScraping;
import edu.cecar.modelo.Multimedia;

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
        
     try {
            // TODO code application logic here
            /*
            * Se realiza la conexion a la base datos
            * Configure los parametros segun sus especificaciones
            */
            ConectarMySQL.getConectarMySQL("127.0.0.1:3306", "reconocedorrelaciones", "rr", "");
            
            System.out.println("Iniciando Scrapeo\n\n");
            
            //Se procede a scrapear la pagina
            ControladorScraping controladorScraping = new ControladorScraping();
            
            //Se inicia el controlador DAO para los paises
            ControladorDAO controladorDAO = new ControladorDAO();
            
            System.out.println("Insertando datos scrapeados en la de la base datos\n\n");
            
            //Se recorren los datos scrapeados
            for (Multimedia multimedia : controladorScraping.getRR()) {
                
                controladorDAO.insert(multimedia);
                
            }
            
            System.out.println("Datos de la base de datos");
            
            //Se visualizan los datos insertado
            for (Multimedia multimedia : controladorDAO.extraer()) {
                
                System.out.println(multimedia);
                
                
                
            }   } catch (Exception e) {
            e.printStackTrace();
        }
     
     // TODO code application logic here

        System.out.println("OK... WELL!!");
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new GuiPrincipal().setVisible(true);
                }
            });
        
        
    
}
        

   

}
