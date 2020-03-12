/**
 *
 * Clase: Scraping
 *
 * @class Expression class is undefined on line 5, column 12 in Templates/Classes/Class.java.
 *
 * versión:0.1
 *
 * fecha Creación: 4/03/2020
 *
 * fecha Modificación: 4/03/2020
 *
 * Autor: Carmen Salgado...
 *
 * @author Casalg
 * 
 * Copyright: CECAR
 *
**/

package edu.cecar.controladores;

import edu.cecar.modelo.Multimedia;
import edu.cecar.vista.GuiPrincipal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * EN ESTA CLASE SE HACE LA EXTRACIÓN DE LOS DATOS DESEADOS DESDE EL HTML ...
 *
**/

public class ControladorScraping {
    
 public List<Multimedia> getRR() throws IOException{
 
  List<Multimedia> multimedias = new ArrayList<Multimedia>();
    //Se inicia el proceso de Scraping
        Document document = Jsoup.
                            connect("https://capacitateparaelempleo.org/pages.php")
                            .get(); // TODO Auto-generated catch block
        Elements elements = document.
//        select("body").
//        select("div").
//        select("img").
        select("src");
        for (Element fila : elements) {

        Elements columnas = fila.select("bd");

        if (columnas.hasText()) {

        Multimedia multimedia = new Multimedia(columnas.get(0).text(), 
                                               columnas.get(1).text(), 
                                               columnas.get(2).text(), 
                                               columnas.get(3).text());

        multimedias.add(multimedia);
              
 
 }
}
 return multimedias;
}

}