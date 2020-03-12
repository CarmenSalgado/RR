/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.test;

import edu.cecar.componentesReutilizables.ConectarMySQL;
import edu.cecar.controladores.ControladorDAO;
import edu.cecar.controladores.ControladorScraping;
import edu.cecar.modelo.Multimedia;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Casalg
 */
public class TestMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            /*
            * Se realiza la conexion a la base datos
            * Configure los parametros segun sus especificaciones
            */
            ConectarMySQL.getConectarMySQL("192.168.1.69", "reconocedorrelaciones", "rr", "");
            
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
    
}
}
