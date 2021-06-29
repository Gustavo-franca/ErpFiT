package Domain.factories;

import Domain.models.address.Country;
import Domain.valueObjects.implementation.CountryDescription;

public class CountryFactory {
   
    public CountryFactory(){
        
    }

    public Country create(String countryName) throws Error{
        try{
            return new Country(new CountryDescription(countryName));
        }catch(Error err){
            throw err;
        }
        
    }

    public Country create(int i, String string) {
        return new Country(i,new CountryDescription(string));
    }


}
