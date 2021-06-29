
import Desktop.Controller.MainController;
import Desktop.View.MainMenuView;
import aplication.useCases.*;
import infrastructure.database.ConnectionFactory;
import infrastructure.repositories.country.CountryRepository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String[] args) {
        CountryRepository rp = new CountryRepository();
        boolean success = new CountryUseCase(rp).register("Alemanha");
        System.out.println("O Pais foi registrado? " + success);
    }*/
 
    public static void main(String[] args) {
        UseCases useCases = new UseCases();
        var main = new MainController(useCases);
        main.init();
        
    } 
    
}
