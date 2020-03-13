/**
 *
 * Clase: DAO
 *
 * @class Expression class is undefined on line 5, column 12 in Templates/Classes/Class.java.
 *
 * versión:0.1
 *
 * fecha Creación: 8/03/2020
 *
 * fecha Modificación: 8/03/2020
 *
 * Autor: Carmen Salgado...
 *
 * @author Casalg
 * 
 * Copyright: CECAR
 *
**/

package edu.cecar.controladores;
import edu.cecar.componentesDAO.DAOInterface;
import edu.cecar.componentesReutilizables.ConectarMySQL;
import edu.cecar.modelo.Multimedia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
*
* ESTA CLASE IMPLEMENTA LOS METODOS DE LA INTERFACE ControladorDAO...
*
**/

public class ControladorDAO implements DAOInterface<Multimedia>{
    
 private String tabla = "multimedia";
    @Override
    public String insert(Multimedia multi) {
     
     String result="";
     
     try {
         PreparedStatement ps = ConectarMySQL.getConexion().prepareStatement("insert into"
                                                                             +tabla
                                                                             +"values(?,?,?,?)");
         
         ps.setString(1, (String) multi.getArchivo());
         ps.setString(2, multi.getTipo());
         ps.setString(2, multi.getFecha());;
         ps.setString(4, multi.getUrl());
         ps.execute();
         
              
     } catch (SQLException e) {
         result= e.getMessage();
     }
          
     return result;
    }

    @Override
    public String update(Multimedia multi) {
     
     String result="";
     
     try {
         PreparedStatement ps = ConectarMySQL.getConexion().prepareStatement("update"+
                                                                                tabla+
                                                 " set fecha = ?, tipo = ? " +
					                           " where multi = ?");
         
         ps.setString(1, (String) multi.getArchivo());
         ps.setString(2, multi.getTipo());
         ps.setString(2, multi.getFecha());;
         ps.setString(4, multi.getUrl());
         ps.execute();
         
              
     } catch (SQLException e) {
         result= e.getMessage();
     }
          
     return result;
    }

    @Override
    public String delete(String... criteriosBusqueda) {
     
     String result="";
     
     try {
         PreparedStatement ps = ConectarMySQL.getConexion().prepareStatement("delete  from " +
                                                                                       tabla +
                                                                           " where multi = ?");
         
         ps.setString(1, criteriosBusqueda[0]);
         ps.execute();
         
     } catch (SQLException e) {
         result= e.getMessage();
     }
     
     return result;
    }

    @Override
    public Multimedia consultar(String... criteriosBusqueda) {
     
     Multimedia multimedia = null;
     
     try {
         PreparedStatement ps = ConectarMySQL.getConexion().prepareStatement("Select*  from " +
                                                                                        tabla +
                                                                            " where multimedia = ?");
         
         ps.setString(1, criteriosBusqueda[0]);
         ResultSet resultSet = ps.executeQuery();
         
          if (resultSet.next()) {
          
            multimedia = new Multimedia(resultSet.getString(1),
                                        resultSet.getString(2),
                                        resultSet.getString(3));
          
          }
         
     } catch (SQLException e) {
         
         e.printStackTrace();
         
     }
      
     return multimedia;
    }

    /**
     *
     * @return
     */
 @Override
    public List<Multimedia> extraer() {
     
     List<Multimedia> multimedias = new ArrayList<Multimedia>();
     
     try {
         PreparedStatement ps = ConectarMySQL.getConexion().prepareStatement("Select *  from " +
                                                                                         tabla);
         
         ResultSet resultSet = ps.executeQuery();
         
         while (resultSet.next()) {
          
//            multimedias = new Multimedia(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
//            
//
//            multimedias.add(Multimedia);
         }
         
     } catch (SQLException e) {
         e.printStackTrace();
     }
             
     return multimedias;
    }

    

   

}
