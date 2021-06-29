/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.repositories;

import Domain.models.address.Country;
import infrastructure.database.ConnectionFactory;
import java.sql.Connection;
import infrastructure.repositories.country.CountryRepository;
/**
 *
 * @author gustavo
 */
public class Repository {

    public static <T> IRepository<T> getRepository(Class<T> clazz){
            if(Country.class.equals(clazz)){
                return (IRepository<T>) new CountryRepository();
            } 
            
            return null;
    }    
}
