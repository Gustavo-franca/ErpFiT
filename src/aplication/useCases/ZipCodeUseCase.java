package aplication.useCases;

import Domain.factories.ZipCodeFactory;
import Domain.interfaces.IDistrict;
import Domain.interfaces.IZipCode;
import infrastructure.repositories.district.IDistrictRepository;
import infrastructure.repositories.zipCode.IZipCodeRepository;

public class ZipCodeUseCase {
    private IZipCodeRepository repository;
    private IDistrictRepository districtRepository;
    
    public ZipCodeUseCase( IZipCodeRepository repository, IDistrictRepository districtRepository){
        this.repository = repository;
        this.districtRepository = districtRepository;
    }

    public boolean register(String zipCodeNumber, String cityName ) {
        try{  
            IDistrict district = this.districtRepository.findByDesc(cityName);
            if(district == null)throw new Error("district not registered");
            IZipCode zipCode = new ZipCodeFactory().create(zipCodeNumber,district);
            this.repository.register(zipCode);
            return true;
        }catch(Error error){
            return false;
        }
    }
}
