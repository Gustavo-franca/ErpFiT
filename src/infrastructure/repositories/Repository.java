/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.repositories;

import Domain.models.address.Country;
import Domain.models.address.State;
import infrastructure.database.ConnectionFactory;
import java.sql.Connection;
import infrastructure.repositories.country.CountryRepository;
import infrastructure.repositories.state.StateRepository;
/**
 *
 * @author gustavo
 */
public class Repository {

    public static <T> IRepository<T> getRepository(Class<T> clazz){
            if(Country.class.equals(clazz)){
                return (IRepository<T>) new CountryRepository();
            } else if(State.class.equals(clazz)){
                return (IRepository<T>) new StateRepository();
            }
            
            return null;
    }    
}
