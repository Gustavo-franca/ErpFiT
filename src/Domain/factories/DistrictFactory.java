package Domain.factories;

import Domain.interfaces.ICity;
import Domain.interfaces.IDistrict;
import Domain.models.address.District;
import Domain.valueObjects.implementation.DefaultDescription;
public class DistrictFactory {
    public DistrictFactory(){
        
    }

    public IDistrict create(String districtName,ICity city) throws Error{
        try{
            return new District(new DefaultDescription(districtName),city);
        }catch(Error err){
            throw err;
        }
        
    }
}
