
package DAO.SQLServer;

import DAO.UnidadesDAO;
import Ventanas.UnidadesDeMedida;
import java.sql.Connection;
import java.util.List;


public class UnidadesSQLServerDAO implements UnidadesDAO{
    
    final String INSERT = "INSERT INTO UnidadesMedida (idUnidad, nombre, siglas, estatus) VALUES (?,?,?,'A')";
    final String UPDATE = "UPDATE UnidadesMedida SET nombre=?, siglas=? WHERE idUnidad=?";
    final String DELETE = "UPDATE UnidadesMedida SET estatus='I' WHERE idUnidad=?";
    final String GETALL = "SELECT idUnidad, nombre, siglas, estatus FROM UnidadesMedida"; 
    
    private Connection conn;
    
    public UnidadesSQLServerDAO(Connection conn){
        this.conn = conn;
    }
    
    @Override
    public void insertar(UnidadesDeMedida u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(UnidadesDeMedida u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(UnidadesDeMedida u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UnidadesDeMedida> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UnidadesDeMedida obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
