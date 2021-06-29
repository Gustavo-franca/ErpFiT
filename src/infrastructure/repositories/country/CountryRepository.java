/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
package infrastructure.repositories.country;
import Domain.factories.CountryFactory;
import Domain.interfaces.ICountry;
import Domain.models.address.Country;
import infrastructure.database.ConnectionFactory;
import infrastructure.repositories.IRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author gustavo
 */

 
public class CountryRepository implements IRepository<Country> {

    @Override
    public void register(Country country) throws Error {
        Connection connection = ConnectionFactory.getConnection();
        String Sql = "INSERT INTO Pais (descricao) VALUES(?)";
        PreparedStatement pstm = null;
        try{
            pstm = connection.prepareStatement(Sql);
            pstm.setString(1,country.description());
            pstm.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();  
            throw new Error("falha ao Gravar dados");
        }finally{
             ConnectionFactory.closeConnection(connection, pstm);
        }
    }
 
    private List<Country> retrieve() {
        Connection connection = ConnectionFactory.getConnection();
        String Sql = "SELECT idPais,descricao FROM Pais";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            pstm = connection.prepareStatement(Sql);
            rs = pstm.executeQuery();
            
            List<Country> paises = new ArrayList();
            
            while(rs.next()){
                var country =  new CountryFactory().create(rs.getInt("idPais"),rs.getString("descricao"));
                paises.add(country);
            }
            
            ConnectionFactory.closeConnection(connection, pstm, rs);
            return paises;
        }catch(Exception ex){
            ConnectionFactory.closeConnection(connection, pstm, rs);
            return null;
        }
        
    } 
    private Country retrieve(int id) {
           Connection connection = ConnectionFactory.getConnection();
        String Sql = "SELECT idPais,descricao FROM Pais WHERE idPais= ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            pstm = connection.prepareStatement(Sql);
            pstm.setInt(1,id);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Country pais =new CountryFactory().create(rs.getInt("idPais"),rs.getString("descricao"));
                ConnectionFactory.closeConnection(connection, pstm, rs);
                return pais;
            }
            ConnectionFactory.closeConnection(connection, pstm, rs);
            return null;
           

        }catch(Exception ex){
            ConnectionFactory.closeConnection(connection, pstm, rs);
            return null;
        }
    }

    public void update(Country pais) {
        Connection connection = ConnectionFactory.getConnection();
        String Sql = "UPDATE Pais SET descricao = ? WHERE idPais= ? ";
        PreparedStatement pstm = null;
        try{
            pstm = connection.prepareStatement(Sql);
            pstm.setString(1,pais.description());
            pstm.setInt(2,pais.id());
            pstm.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();  
        }finally{
             ConnectionFactory.closeConnection(connection, pstm);
        }
    }

    /*
    @Override
    public void Delete(Country pais) {
        Connection connection = ConnectionFactory.getConnection();
        String Sql = "DELETE FROM Pais WHERE idPais= ? ";
        PreparedStatement pstm = null;
        try{
            pstm = connection.prepareStatement(Sql);
            pstm.setInt(1,pais.id());
            pstm.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();  
        }finally{
             ConnectionFactory.closeConnection(connection, pstm);
        }
    }*/

    @Override
    public void save(Country t) {
        update(t);
        return;
    }


    @Override
    public List<Country> findAll() {
       return this.retrieve();
    }

    @Override
    public List<Country> searchFor(String search) {
        var countries = retrieve();
        String pattern = "" + search.trim().toLowerCase() +".+";
        return countries.stream().filter((c)->c.description().toLowerCase().matches(pattern)).collect(Collectors.toList());

    }

    @Override
    public Country findById(Integer id) {
        return retrieve(id);
    }

    @Override
    public Integer findIdByDesc(String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Country findByDesc(String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
