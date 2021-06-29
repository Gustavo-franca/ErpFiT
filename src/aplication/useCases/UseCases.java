package aplication.useCases;

import infrastructure.repositories.Repository;
import Domain.models.address.Country;
import Domain.models.address.State;
import aplication.useCases.address.CountryUseCase;
import aplication.useCases.address.StateUseCase;
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
    private StateUseCase stateUseCase;
    public UseCases(){
       countryUseCase = new CountryUseCase(Repository.getRepository(Country.class));
       stateUseCase = new StateUseCase(Repository.getRepository(State.class),Repository.getRepository(Country.class));
    }
    
    public CountryUseCase getCountryUseCase(){
        return this.countryUseCase;
    }

    public StateUseCase getStateUseCase() {
        return this.stateUseCase;
    }
    
}
