/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.models;

import Domain.interfaces.ICity;
import Domain.interfaces.IDistrict;
import Domain.valueObjects.IDescription;

/**
 *
 * @author gustavo
 */
public  class District implements IDistrict {
    private int id;
    private IDescription description; 
    private ICity city;

  

    public District(int id, IDescription description, ICity city) {
        this.id = id;
        this.description = description;
        this.city = city;
    }

    public District(IDescription description, ICity city) {
        this.description = description;
        this.city = city;
    }

    public int id() {
        return id;
    }

    @Override
    public String city() {
        return this.city.city();
    }

    @Override
    public String state() {
       return this.city.state();
    }

    @Override
    public String country() {
        return this.city.country();
    }

    @Override
    public String district() {
        return this.description.getValue();
    }
    
    
    
    
}
