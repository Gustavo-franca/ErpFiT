/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.models;

import Domain.interfaces.ICountry;
import Domain.valueObjects.IDescription;

/**
 *
 * @author gustavo
 */
public class Country implements ICountry {
    private int id;
    private IDescription description;

    public Country(int id, IDescription description) {
        this.id = id;
        this.description = description;
    }

    
    public Country(IDescription description) {
        this.description = description;
    }

    public String country(){
        return description.getValue();
    }
    public int id() {
        return id;
    }
    public void country(IDescription description) {
        this.description = description;
    }
    
    
     
}
