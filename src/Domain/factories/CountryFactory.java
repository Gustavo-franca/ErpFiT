package Domain.factories;

import Domain.interfaces.ICountry;
import Domain.models.Country;
import Domain.valueObjects.implementation.CountryDescription;

public class CountryFactory {
   
    public CountryFactory(){
        
    }

    public ICountry create(String countryName) throws Error{
        try{
            return new Country(new CountryDescription(countryName));
        }catch(Error err){
            throw err;
        }
        
    }
}
