package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Client;
import model.Function;
import model.FunctionData;

public class RegisterClients implements Initializable{

    @FXML
    private Button doneBTN;

    @FXML
    private TextField nameClientTF;

    @FXML
    private TextField idClientTF;

    @FXML
    private ChoiceBox<String> roomChoiceCB;
    
    @FXML
    private Button volverBTN;
    
    FunctionData functionData;
    
    @FXML
    void doneRegisteredClient(ActionEvent event) throws IOException, ClassNotFoundException, ParseException {
    	
    	String clientName = nameClientTF.getText();
    	String clientId = idClientTF.getText();
    	
    	String[] data = (roomChoiceCB.getSelectionModel().getSelectedItem()).split("\\|");
    	
    	String roomString = data[1];
    	
    	Client client = new Client(clientName,clientId);
       
    	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy:MM:dd:HH:mm");
    	
    	Date date = sdf1.parse(data[2]+":"+data[3]);
    	
    	Function addingFunction = null;
    	
    	for(Function f : functionData.functions) {
    		if(f.getDate().equals(date)) {
    			addingFunction = f;
    			break;
    		}
    	}

        if(roomString.equalsIgnoreCase("Mini room")) {
        	FXMLLoader loader = new FXMLLoader(Entry.class.getResource("../ui/MiniRoomMap.fxml"));
    		loader.setController(new MiniRoomMap(client, addingFunction, functionData));
    		Parent parent = (Parent) loader.load();
    		Stage stage = new Stage();
    		Scene scene = new Scene(parent);
    		stage.setScene(scene);
    		stage.show();
    		
        }
        else if(roomString.equalsIgnoreCase("Medium room")) {
        	FXMLLoader loader = new FXMLLoader(Entry.class.getResource("../ui/MediumRoomMap.fxml"));
    		loader.setController(new MediumRoomMap(client, addingFunction, functionData));
    		Parent parent = (Parent) loader.load();
    		Stage stage = new Stage();
    		Scene scene = new Scene(parent);
    		stage.setScene(scene);
    		stage.show();
    		
        }
     
    }
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		createRoomsCB();	
		try {
			functionData = new FunctionData();
			functionData.loadJSON();
		} catch (ClassNotFoundException | IOException | ParseException e) {
			e.printStackTrace();
		}
	}
    public void createRoomsCB() {
    	String path="Functions.csv";
		File file=new File(path);
		
		if(file.exists()) {
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			String line;
			try {
				line=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				while((line=br.readLine())!=null) {
					String[] datosSeparados=line.split("\\|");
					String nombre=datosSeparados[0];
					String sala=datosSeparados[1];
					String fecha=datosSeparados[2];
					String hora=datosSeparados[3];
					roomChoiceCB.getItems().add(nombre+"|"+sala+"|"+fecha+"|"+hora);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
    @FXML
    void volver(ActionEvent event) throws IOException {
		 FXMLLoader loader = new FXMLLoader(Entry.class.getResource("../ui/Menu.fxml"));
 		loader.setController(new Menu());
 		Parent parent = (Parent) loader.load();
 		Stage stage = new Stage();
 		Scene scene = new Scene(parent);
 		stage.setScene(scene);
 		stage.show();
 		
 		Stage stage1 = (Stage) volverBTN.getScene().getWindow();
 	    stage1.close();
    }

}
