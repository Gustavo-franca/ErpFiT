package infrastructure.repositories.state;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Domain.interfaces.ICountry;
import Domain.interfaces.IState;
import Domain.models.address.State;
import infrastructure.database.ConnectionFactory;
import infrastructure.repositories.country.ICountryRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author gustavo
 */

 /*
public class StateRepository implements IStateRepository {
    private ICountryRepository countryRepository;
    public StateRepository(ICountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }
    @Override
    public void register(IState state) throws Error {
        Connection connection = ConnectionFactory.getConnection();
        String Sql = "INSERT INTO Estado (descricao,Pais_idPais) VALUES(?,?)";
        PreparedStatement pstm = null;

        int countryId = this.countryRepository.findIdByDesc(state.country());
        try{
            pstm = connection.prepareStatement(Sql);
            pstm.setString(1,state.description());
            pstm.setInt(2,countryId);
            pstm.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();  
            throw new Error("falha ao Gravar dados");
        }finally{
             ConnectionFactory.closeConnection(connection, pstm);
        }
    }*/
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

     /*
    @Override
    public int findIdByDesc(String description) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public IState findByDesc(String description) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void save(IState t) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public IState[] findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public IState[] searchFor(String search) {
        // TODO Auto-generated method stub
        return null;
    }
}
*/
