package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Entry{

    @FXML
    private TextField idBUTF;

    @FXML
    private Button joinBTN;
    
    private String idBU;
    
    private String path;
    
    File file;
	FileInputStream fis;
	
	InputStreamReader isr;
	BufferedReader br;
    
	
    public Entry() throws IOException{
    	path = "identifications.txt";
    }
    
    public void createReader() throws IOException {
    	file = new File(path);

    	fis = new FileInputStream(file);
    	
    	isr = new InputStreamReader(fis);
    	br = new BufferedReader(isr);
    }


	
	@FXML
    void joinBU(ActionEvent event) throws IOException {
		
		createReader();
		
		idBU = idBUTF.getText();
		
		boolean canEntry = false;
		
		String line = null;
		
		while((line = br.readLine()) != null) {
			
			if(line.equalsIgnoreCase(idBU)) {
				canEntry = true;
			}
			
		}
		
		if(canEntry) {
			initializeMenu();
			Stage stage = (Stage) joinBTN.getScene().getWindow();
		    stage.close();
		}
		else {
			cantEntryAlert();
		}
		
		fis.close();
		
    }
	
	public void initializeMenu() throws IOException {
		FXMLLoader loader = new FXMLLoader(Entry.class.getResource("../ui/Menu.fxml"));
		loader.setController(new Menu());
		Parent parent = (Parent) loader.load();
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
		
	}
	
	private void cantEntryAlert() {
	    Alert alert = new Alert(Alert.AlertType.ERROR);
	    alert.setHeaderText(null);
	    alert.setTitle("Error");
	    alert.setContentText("Su número de cedula no está registrado en la base de datos de bienestar universitario.");
	    alert.showAndWait();
	}
	
}
