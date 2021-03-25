/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author jmadr
 */
public interface DAO<T, K> {
    
    void insertar(T u);
    
    void modificar(T u);
    
    void eliminar(T u);
    
    List<T> obtenerTodos();
    
    T obtener(K id);
    
}
