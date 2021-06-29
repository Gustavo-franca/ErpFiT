package aplication.useCases.address;

import java.util.List;

import Domain.factories.StateFactory;
import Domain.interfaces.ICountry;
import Domain.interfaces.IState;
import Domain.models.address.Country;
import Domain.models.address.State;
import infrastructure.repositories.IRepository;
import infrastructure.repositories.country.ICountryRepository;
import infrastructure.repositories.state.IStateRepository;

public class StateUseCase {
    private IRepository<State> repository;
    private IRepository<Country> countryRepository;
    public StateUseCase( IStateRepository repository, ICountryRepository countryRepository){
       
    }

    public StateUseCase(IRepository<State> repository,IRepository<Country> countryRepository) {
        this.repository = repository;
        this.countryRepository = countryRepository;
    }

    public boolean save(String previosStateName, String newStateName){
        try{
            State state = this.repository.findByDesc(previosStateName);
            if(state == null) throw new Exception("state not registered ");
            state.description(newStateName);
            this.repository.save(state);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean register(String StateName, String countryName ) {
        try{  
            Country country = this.countryRepository.findByDesc(countryName);
            if(country == null)throw new Error("country not registered");
            State State = new StateFactory().create(StateName,country);
            this.repository.register(State);
            return true;
        }catch(Error error){
            return false;
        }
    }

    public List<State> findAll(){
        return this.repository.findAll();
    }
    public List<State> searchFor(String search){
        return this.repository.searchFor(search);
    }
}
