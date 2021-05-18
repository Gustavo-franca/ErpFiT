package aplication.useCases;

import Domain.factories.DistrictFactory;
import Domain.interfaces.ICity;
import Domain.interfaces.IDistrict;
import infrastructure.repositories.city.ICityRepository;
import infrastructure.repositories.district.IDistrictRepository;

public class DistricUseCase {
    private IDistrictRepository repository;
    private ICityRepository cityRepository;
    
    public DistricUseCase( IDistrictRepository repository, ICityRepository cityRepository){
        this.repository = repository;
        this.cityRepository = cityRepository;
    }

    public boolean register(String districtName, String cityName ) {
        try{  
            ICity city = this.cityRepository.findByDesc(cityName);
            if(city == null)throw new Error("city not registered");
            IDistrict district = new DistrictFactory().create(districtName,city);
            this.repository.register(district);
            return true;
        }catch(Error error){
            return false;
        }
    }
}
