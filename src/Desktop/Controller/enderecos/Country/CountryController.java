/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desktop.Controller.enderecos.Country;

import aplication.useCases.address.CountryUseCase;
import View.enderecos.CountrySearchView;
import View.enderecos.CountryRegisterView;
import aplication.useCases.address.CountryUseCase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author gustavo
 */
public class CountryController implements ActionListener {
    public int id;
    private CountryUseCase useCase;
    private final CountryRegisterView view = new CountryRegisterView();


    public CountryController(CountryUseCase useCase ) {
        this.useCase = useCase;
        clearInputs();
        editable(false);
        this.view.getjButtonGravar().addActionListener(this);
        this.view.getjButtonBuscar().addActionListener(this);
        this.view.getjButtonSair().addActionListener(this);
        this.view.getjButtonNovo().addActionListener(this);
        this.view.getjButtonCancelar().addActionListener(this);
        
        view.setVisible(true);
    }
    
    

    
    @Override
    public void actionPerformed(ActionEvent e) { 
       if(this.view.getjButtonNovo().equals(e.getSource())){
           this.New();
       }else if(e.getSource() == this.view.getjButtonCancelar()){

          this.cancel();
       }else if(e.getSource() == this.view.getjButtonGravar()){
          this.save();
       }else if(e.getSource() == this.view.getjButtonBuscar()){

           this.search();
       }else if(e.getSource() == this.view.getjButtonSair()){
 
          this.exit();
       }
       
    }

    private void clearInputs() {
         JTextField id = this.view.getTextInputId();
         JTextField nome = this.view.getTextInputNome();
         id.setText("");
         nome.setText("");
    }
    
    
    private void editable(boolean estado) {
       var id = this.view.getTextInputId();
         var nome = this.view.getTextInputNome();
         id.setEnabled(false);
         nome.setEnabled(estado);
        var gravar = this.view.getjButtonGravar();
        var buscar = this.view.getjButtonBuscar();
        var sair = this.view.getjButtonSair();
        var novo = this.view.getjButtonNovo();
      var cancelar = this.view.getjButtonCancelar();
      
      novo.setEnabled(!estado);
      buscar.setEnabled(!estado);
      sair.setEnabled(!estado);
      cancelar.setEnabled(estado);
      gravar.setEnabled(estado);
    }
    


    private void New() {
        clearInputs();
        editable(true);
    }

    private void cancel() {
       clearInputs();
        editable(false);
    }

    private void save() {
       var id = this.view.getTextInputId().getText();
       var name = this.view.getTextInputNome().getText();
       if(id.length() > 0){
           useCase.save(Integer.parseInt(id),name);
          System.out.println("\n----Sucesso ao Atualizar!----\n");
          this.cancel();
       }else{
           useCase.register(name);
          System.out.println("\n----Sucesso ao Criar!----\n");
          this.cancel();
       }
        
    }

    private void search() {
        var searchController = new SearchCountryController(useCase);
        var id = searchController.getIdSelected();
    
         if( id != null ){
             this.clearInputs();
             var country = useCase.searchForId(id);
             this.refreshInputs(country.id(),country.description());
             this.editable(true);
         }

        
    }

    private void exit() {
        this.view.setVisible(false);
        this.view.dispose();
    }

    private void refreshInputs(int id, String nome) {
       this.view.getTextInputId().setText(Integer.toString(id));
       this.view.getTextInputNome().setText(nome);
    }
   
}
