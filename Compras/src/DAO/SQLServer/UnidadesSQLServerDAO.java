
package DAO.SQLServer;

import Coexion.Conexion;
import DAO.DAOException;
import DAO.UnidadesDAO;
import Ventanas.UnidadesDeMedida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;



public class UnidadesSQLServerDAO implements UnidadesDAO{
    
    final String INSERT = "INSERT INTO UnidadesMedida (nombre, siglas, estatus) VALUES (?,?,'A')";
    final String UPDATE = "UPDATE UnidadesMedida SET nombre=?, siglas=? WHERE idUnidad=?";
    final String DELETE = "UPDATE UnidadesMedida SET estatus='I' WHERE idUnidad=?";
    final String GETALL = "SELECT idUnidad, nombre, siglas, estatus FROM UnidadesMedida"; 
     final String GETONE = "SELECT idUnidad, nombre, siglas, estatus FROM UnidadesMedida WHERE idUnidad=?"; 
    
    private Connection conn;
    
    public UnidadesSQLServerDAO(Connection conn){
        this.conn = conn;
    }
    
    public void insert() throws DAOException{
        UnidadesDeMedida u = null;
        PreparedStatement stat = null;
        
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, u.getNombre());
            stat.setString(2, u.getSiglas());
            if(stat.executeUpdate()==0){
                throw new DAOException("Puede que no se haya guardado.");
            }
        } catch(SQLException ex){
            throw new DAOException("Error en SQL", ex);
        } 
        finally{
            if(stat != null){
                try{
                stat.close();
                }catch(SQLException ex){
                  throw new DAOException("Error en SQL", ex);
                }    
                }
            
        }
    }
    
    @Override
    public void insertar(UnidadesDeMedida u) throws DAOException{
        PreparedStatement stat = null;
        
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, u.getNombre());
            stat.setString(2, u.getSiglas());
            if(stat.executeUpdate()==0){
                throw new DAOException("Puede que no se haya guardado.");
            }
        } catch(SQLException ex){
            throw new DAOException("Error en SQL", ex);
        } 
        finally{
            if(stat != null){
                try{
                stat.close();
                }catch(SQLException ex){
                  throw new DAOException("Error en SQL", ex);
                }    
                }
            
        }
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
