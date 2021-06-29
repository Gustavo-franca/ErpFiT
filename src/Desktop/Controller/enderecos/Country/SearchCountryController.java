/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desktop.Controller.enderecos.Country;

import Domain.models.address.Country;
import View.enderecos.CountrySearchView;
import aplication.useCases.address.CountryUseCase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author gustavo
 */
public class SearchCountryController  implements ActionListener {
    private Integer selectedId;
    private final CountrySearchView view = new CountrySearchView(null,true);
    private CountryUseCase useCase;

    public SearchCountryController(CountryUseCase useCase) {
        this.useCase = useCase;
        this.view.getjButtonBusca().addActionListener(this);
        this.view.getjButtonSair().addActionListener(this);
        this.view.getjSearchText().getDocument().addDocumentListener(listinningInput());
        initTable(useCase.findAll());
        this.view.setVisible(true);


 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(this.view.getjButtonBusca().equals(e.getSource())){
           var table =  this.view.getjTable();
           if(table.getSelectedRow() > -1){
               selectedId =(int) table.getValueAt(table.getSelectedRow(),0);
           }
      
          this.view.setVisible(false);
          this.view.dispose(); 
           
       }else if(e.getSource() == this.view.getjButtonSair()){
          this.view.setVisible(false);
          this.view.dispose();
       }
    }

    Integer getIdSelected() {
        return selectedId;
    }
    
    private void searchAndUpdateTable(String pattern){ 
        var list = useCase.searchFor(pattern);      
        if(list != null){
            initTable(list);
            return;
        }
        initTable(new ArrayList<>());
    }
    
    private void initTable(List<Country> list){
        var table = this.view.getjTable();
        var tableModel = (DefaultTableModel) table.getModel();
        int size = tableModel.getRowCount();
       for(int i = 0 ; i < size; i++)
           tableModel.removeRow(0);
       
        for(var country : list){
            System.out.print(country.description() + "\n");
            tableModel.addRow(new Object[]{country.id(),country.description()});
        }
       table.repaint();
       view.repaint();
        
        
    }

    private String getTextByDocumentEvent(DocumentEvent arg){
            var document = arg.getDocument();
                var startPosition = document.getStartPosition();
                var endPosition = document.getEndPosition();
                try {
                    return document.getText(startPosition.getOffset(),endPosition.getOffset());
                } catch (BadLocationException ex) {
                    return "";
                }
    }
    private DocumentListener listinningInput() {
        return new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg) {
                String text = getTextByDocumentEvent(arg);
                searchAndUpdateTable(text);
            }

            @Override
            public void removeUpdate(DocumentEvent arg) {
                   String text = getTextByDocumentEvent(arg);
                    searchAndUpdateTable(text);
            }

            @Override
            public void changedUpdate(DocumentEvent arg) {
                String text = getTextByDocumentEvent(arg);
               searchAndUpdateTable(text);
            }
        };
    }
}
