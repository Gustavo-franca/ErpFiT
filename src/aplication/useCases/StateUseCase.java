package aplication.useCases;

import Domain.factories.StateFactory;
import Domain.interfaces.ICountry;
import Domain.interfaces.IState;
import infrastructure.repositories.country.ICountryRepository;
import infrastructure.repositories.state.IStateRepository;

public class StateUseCase {
    private IStateRepository repository;
    private ICountryRepository countryRepository;
    public StateUseCase( IStateRepository repository, ICountryRepository countryRepository){
        this.repository = repository;
        this.countryRepository = countryRepository;
    }

    public boolean register(String StateName, String countryName ) {
        try{  
            ICountry country = this.countryRepository.findByDesc(countryName);
            if(country == null)throw new Error("country not registered");
            IState State = new StateFactory().create(StateName,country);
            this.repository.register(State);
            return true;
        }catch(Error error){
            return false;
        }
    }
}
