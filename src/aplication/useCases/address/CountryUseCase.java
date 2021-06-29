package aplication.useCases.address;

import java.util.List;

import Domain.factories.CountryFactory;
import Domain.models.address.Country;
import infrastructure.repositories.IRepository;
import infrastructure.repositories.country.ICountryRepository;

public class CountryUseCase {
    private IRepository<Country>  repository;
    public CountryUseCase( IRepository<Country> repository){
        this.repository = repository;
    }

    public boolean save(Integer id , String countryName){
        try{
            Country country = this.repository.findById(id);
            if(country == null)register(countryName);
            country.description(countryName);
            this.repository.save(country);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean register(String countryName ) {
        try{  
            Country country = new CountryFactory().create(countryName);
            this.repository.register(country);
            return true;
        }catch(Error error){
            return false;
        }
    }

    public List<Country> findAll(){
        return this.repository.findAll();
    }
    public List<Country> searchFor(String search){
        return this.repository.searchFor(search);
    }
    public Country searchForId(Integer id){
        return this.repository.findById(id);
    }
}
