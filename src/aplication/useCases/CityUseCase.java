package aplication.useCases;

import Domain.factories.CityFactory;
import Domain.interfaces.ICity;
import Domain.interfaces.IState;
import infrastructure.repositories.city.ICityRepository;
import infrastructure.repositories.state.IStateRepository;

public class CityUseCase {
    private ICityRepository repository;
    private IStateRepository stateRepository;
    
    public CityUseCase( ICityRepository repository, IStateRepository stateRepository){
        this.repository = repository;
        this.stateRepository = stateRepository;
    }

    public boolean register(String cityName, String stateName ) {
        try{  
            IState state = this.stateRepository.findByDesc(stateName);
            if(state == null)throw new Error("state not registered");
            ICity city = new CityFactory().create(cityName,state);
            this.repository.register(city);
            return true;
        }catch(Error error){
            return false;
        }
    }
}
