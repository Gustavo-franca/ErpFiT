package Domain.factories;

import Domain.interfaces.IDistrict;
import Domain.interfaces.IZipCode;
import Domain.models.ZipCode;
import Domain.valueObjects.implementation.DefaultDescription;

public class ZipCodeFactory {
   
    public ZipCodeFactory(){
        
    }

    public IZipCode create(String zipcode,IDistrict district) throws Error{
        try{
            return new ZipCode(new DefaultDescription(zipcode),district);
        }catch(Error err){
            throw err;
        }
        
    }
        
}
