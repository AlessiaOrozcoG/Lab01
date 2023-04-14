package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco = new Parole();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;

    @FXML
   
    void doInsert(ActionEvent event) {
    	this.txtResult.clear();
        this.txtResult.setEditable(false);
    	if(this.txtParola.getText()=="") {
    		this.txtResult.setText("Campo vuoto.\nInserisci parola da aggiungere alla lista!\n");
    		
    	}
    	else {
    		if(this.txtParola.getText().matches(".*[0-9].*")== true) {
    			this.txtResult.setText("\nInserisci parola di senso compiuto!\n");
    			return;
    		} 
    		else {
				elenco.addParola(this.txtParola.getText());  
				for(String s : elenco.getElenco() ) {
					this.txtResult.appendText(s + "\n");
				}
				this.txtParola.clear();
    		}
				
		}
    			
    		
	}
    

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	this.txtResult.setText(null);
    }

    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

}
