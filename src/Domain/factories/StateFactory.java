package Domain.factories;


import Domain.interfaces.ICountry;
import Domain.interfaces.IState;
import Domain.models.address.Country;
import Domain.models.address.State;
import Domain.valueObjects.implementation.DefaultDescription;

public class StateFactory {
    
    public StateFactory(){
        
    }

    public State create(String stateName,Country country) throws Error{
        try{
            return new State(new DefaultDescription(stateName),country);
        }catch(Error err){
            throw err;
        }
        
    }
}
