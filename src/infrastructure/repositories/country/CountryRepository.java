/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.repositories.country;
import Domain.interfaces.ICountry;
import infrastructure.database.ConnectionFactory;
import infrastructure.repositories.IRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class CountryRepository implements ICountryRepository {

    @Override
    public void register(ICountry country) throws Error {
        Connection connection = ConnectionFactory.getConnection();
        String Sql = "INSERT INTO Pais (descricao) VALUES(?)";
        PreparedStatement pstm = null;
        try{
            pstm = connection.prepareStatement(Sql);
            pstm.setString(1,country.country());
            pstm.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();  
            throw new Error("falha ao Gravar dados");
        }finally{
             ConnectionFactory.closeConnection(connection, pstm);
        }
    }
/* 
    @Override
    public List<Pais> retrieve() {
        Connection connection = ConnectionFactory.getConnection();
        String Sql = "SELECT idPais,descricao FROM Pais";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            pstm = connection.prepareStatement(Sql);
            rs = pstm.executeQuery();
            
            List<Pais> paises = new ArrayList();
            
            while(rs.next()){
                Pais pais = new Pais(rs.getInt("idPais"),rs.getString("descricao"));
                paises.add(pais);
            }
            
            ConnectionFactory.closeConnection(connection, pstm, rs);
            return paises;
        }catch(Exception ex){
            ConnectionFactory.closeConnection(connection, pstm, rs);
            return null;
        }
        
    } */
/* 
    @Override
    public Pais retrieve(int id) {
           Connection connection = ConnectionFactory.getConnection();
        String Sql = "SELECT idPais,descricao FROM Pais WHERE idPais= ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            pstm = connection.prepareStatement(Sql);
            pstm.setInt(1,id);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Pais pais = new Pais(rs.getInt("idPais"),rs.getString("descricao"));
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

    @Override
    public void Update(Pais pais) {
        Connection connection = ConnectionFactory.getConnection();
        String Sql = "UPDATE Pais SET descricao = ? WHERE idPais= ? ";
        PreparedStatement pstm = null;
        try{
            pstm = connection.prepareStatement(Sql);
            pstm.setString(1,pais.nome());
            pstm.setInt(2,pais.id());
            pstm.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();  
        }finally{
             ConnectionFactory.closeConnection(connection, pstm);
        }
    }

    @Override
    public void Delete(Pais pais) {
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
    }
     */
}
