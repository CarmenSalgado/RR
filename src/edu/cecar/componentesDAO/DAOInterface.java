/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.componentesDAO;

import java.util.List;

/**
 *
 * @author Casalg
 */
public interface DAOInterface <S> {
    

    
    String insert(S s);

    String update(S s);

    String delete(String ... criteriosBusqueda);

    S consultar(String ... criteriosBusqueda);

    List<S> extraer();
    

    
}
