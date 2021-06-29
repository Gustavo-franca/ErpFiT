/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desktop.Controller.enderecos.state;

import View.enderecos.StateRegisterView;
import aplication.useCases.address.StateUseCase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author gustavo
 */
public class StateController {
     public int id;
    private StateUseCase useCase;
    private final StateRegisterView view = new StateRegisterView();


    public StateController(StateUseCase useCase ) {
        this.useCase = useCase;
        clearInputs();
        editable(false);
        this.view.getjButtonGravar().addActionListener((e)-> save(e));
        this.view.getjButtonBuscar().addActionListener((e) -> search(e));
        this.view.getjButtonSair().addActionListener((e) -> exit(e));
        this.view.getjButtonNovo().addActionListener((e)-> create(e));
        this.view.getjButtonCancelar().addActionListener((e) -> cancel(e));
        
        view.setVisible(true);
    }

    private void save(ActionEvent e) {
       
    }

    private void search(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void exit(ActionEvent e) {
        this.view.setVisible(false);
        this.view.dispose();
    }

    private void create(ActionEvent e) {
        clearInputs();
        editable(true);
    }

    private void cancel(ActionEvent e) {
        clearInputs();
        editable(false);
    }

    private void clearInputs() {
        JTextField id = this.view.getTextInputId();
        JTextField nome = this.view.getTextInputNome();
        id.setText("");
        nome.setText("");
    }

    private void editable(boolean Inputstate) {
        var id = this.view.getTextInputId();
        var name = this.view.getTextInputNome();
        
        id.setEnabled(false);
        name.setEnabled(Inputstate);
        
        this.view.getjButtonGravar().setEnabled(Inputstate);
        this.view.getjButtonBuscar().setEnabled(!Inputstate);
        this.view.getjButtonSair().setEnabled(!Inputstate);
        this.view.getjButtonNovo().setEnabled(!Inputstate);
        this.view.getjButtonCancelar().setEnabled(Inputstate);
    }


}
