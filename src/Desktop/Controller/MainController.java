/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desktop.Controller;

import Desktop.Controller.enderecos.Country.CountryController;
import Desktop.View.MainMenuView;
import aplication.useCases.UseCases;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gustavo
 */
public class MainController  implements ActionListener {
    private final UseCases useCases;
    private final MainMenuView mainMenuView = new MainMenuView();
    public MainController(UseCases useCases) {
        this.useCases = useCases;
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
            
     System.out.print(e.getSource().toString());
    }

    public void init() {
        mainMenuView.setVisible(true);
        
        mainMenuView.addActionListenerForCountry((e)->  new CountryController(useCases.getCountryUseCase()));
    }
}
