/**
 *
 * Clase: Multimedia
 *
 * @class Expression class is undefined on line 5, column 13 in Templates/Classes/Class.java.
 *
 * versión:0.1
 *
 * fecha Creación: 9/03/2020
 *
 * fecha Modificación: 9/03/2020
 *
 * Autor: Carmen Salgado...
 *
 * @author Casalg
 * 
 * Copyright: CECAR
 *
**/

package edu.cecar.modelo;

/**
 *
 * ESTA CLASE PERMITE MODELAR LOS PARAMETROS,EL COSTRUCTOR, LOS METODOS 
 * Y LOS MODIFICADORES DE ACCESO(GET AND SET)DE LA APP...
 *
**/

public class Multimedia {
    
 private Object archivo;
 private String url, tipo, fecha;

    public Multimedia() {
    }

    public Multimedia(Object archivo, String url, String tipo, String fecha) {
      this.archivo = archivo;
      this.url = url;
      this.tipo = tipo;
      this.fecha = fecha;
    }

    public Multimedia(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getArchivo() {
        return archivo;
    }

    public void setArchivo(Object archivo) {
        this.archivo = archivo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
 @Override
    public String toString(){
     return "Archivo : " + archivo +"\nTipo de Archivo : " + tipo + "\nUrl:  " + url + "\nFecha " +fecha + "\n";
}
 
  

   
    
    
    
   

}
