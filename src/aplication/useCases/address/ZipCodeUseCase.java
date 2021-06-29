package aplication.useCases.address;

import java.util.List;

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

    public boolean save(String previosZipCodeName, String newZipCodeName){
        try{
            IZipCode zipcode = this.repository.findByDesc(previosZipCodeName);
            if(zipcode == null)throw new Exception("zipcode not registered ");
            zipcode.description(newZipCodeName);
            this.repository.save(zipcode);
            return true;
        }catch(Exception e){
            return false;
        }
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

    public List<IZipCode> findAll(){
        return this.repository.findAll();
    }
    public List<IZipCode> searchFor(String search){
        return this.repository.searchFor(search);
    }
}
