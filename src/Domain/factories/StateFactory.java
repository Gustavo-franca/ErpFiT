package Domain.factories;


import Domain.interfaces.ICountry;
import Domain.interfaces.IState;
import Domain.models.State;
import Domain.valueObjects.implementation.DefaultDescription;

public class StateFactory {
    
    public StateFactory(){
        
    }

    public IState create(String stateName,ICountry country) throws Error{
        try{
            return new State(new DefaultDescription(stateName),country);
        }catch(Error err){
            throw err;
        }
        
    }
}
