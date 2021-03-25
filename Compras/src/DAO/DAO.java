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
    
    void insertar(T u) throws DAOException;
    
    void modificar(T u) throws DAOException;
    
    void eliminar(T u) throws DAOException;
    
    List<T> obtenerTodos() throws DAOException;
    
    T obtener(K id) throws DAOException;
    
}
