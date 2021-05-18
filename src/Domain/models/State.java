/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.models;

import Domain.interfaces.ICountry;
import Domain.interfaces.IState;
import Domain.valueObjects.IDescription;

/**
 *
 * @author gustavo
 */
public  class State implements IState {
    private int id;
    private IDescription description;
    private ICountry country;

    public State(int id, IDescription description, ICountry country) {
        this.id = id;
        this.description = description;
        this.country = country;
    }

    public State(IDescription description, ICountry country) {
        this.description = description;
        this.country = country;
    }

    
    public int id() {
        return id;
    }
    @Override
    public String country() {
        return country.country();
    }
    @Override
    public String state() {
       return description.getValue();
    }
    
    
    
    
}
