/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.models.address;

import Domain.interfaces.ICity;
import Domain.interfaces.IState;
import Domain.valueObjects.IDescription;

/**
 *
 * @author gustavo
 */
public  class City implements ICity{
    private int id;
    private IDescription description;
    private IState state;

    public City(int id, IDescription description, IState state) {
        this.id = id;   
        this.description = description;
        this.state = state;
    }

    public City(IDescription description, IState state) {
        this.description = description;
        this.state = state;
    }

    public int id() {
        return id;
    }

    public void description(IDescription description) {
        this.description = description;
    }

    public void state(IState state) {
        this.state = state;
    }

    @Override
    public String state() {
        return this.state.description();
    }

    @Override
    public String country() {
        return this.state.country();
    }

    @Override
    public String description() {
        return this.description.getValue();
    }

    @Override
    public void description(String newDescriṕtion) {
        this.description.setValue(newDescriṕtion);
    }
    
}
