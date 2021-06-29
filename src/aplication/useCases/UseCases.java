package aplication.useCases;

import infrastructure.repositories.Repository;
import Domain.models.address.Country;
import aplication.useCases.address.CountryUseCase;
import infrastructure.repositories.country.*;
import java.sql.Connection;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class UseCases {
    private CountryUseCase countryUseCase;
    public UseCases(){
       countryUseCase = new CountryUseCase(Repository.getRepository(Country.class));
    }
    
    public CountryUseCase getCountryUseCase(){
        return this.countryUseCase;
    }
    
}
