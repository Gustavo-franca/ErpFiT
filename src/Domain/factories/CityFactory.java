package Domain.factories;

import Domain.interfaces.ICity;
import Domain.interfaces.IState;
import Domain.models.address.City;
import Domain.valueObjects.implementation.DefaultDescription;

public class CityFactory {
    public CityFactory(){
        
    }

    public ICity create(String cityName, IState state) throws Error{
        try{
            return new City(new DefaultDescription(cityName),state);
        }catch(Error err){
            throw err;
        }
        
    }
}
