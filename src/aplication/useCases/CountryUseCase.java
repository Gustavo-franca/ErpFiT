package aplication.useCases;

import Domain.factories.CountryFactory;
import Domain.interfaces.ICountry;
import infrastructure.repositories.country.ICountryRepository;

public class CountryUseCase {
    private ICountryRepository repository;
    public CountryUseCase( ICountryRepository repository){
        this.repository = repository;
    }

    public boolean register(String countryName ) {
        try{  
            ICountry country = new CountryFactory().create(countryName);
            this.repository.register(country);
            return true;
        }catch(Error error){
            return false;
        }
    }
}
