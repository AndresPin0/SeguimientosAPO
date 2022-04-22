package control;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Function;
import model.FunctionData;

public class RegisterFunctions implements Initializable{

	@FXML
    private TextField nameFunctionTF;

    @FXML
    private Button doneBTN;

    @FXML
    private ChoiceBox<String> functionHoursCB;

    @FXML
    private ChoiceBox<String> functionMinutesCB;

    @FXML
    private ChoiceBox<String> durationHoursCB;

    @FXML
    private ChoiceBox<String> durationMinutesCB;

    @FXML
    private ChoiceBox<String> roomCB;
    
    @FXML
    private Button volverBTN;

    @FXML
    private DatePicker datePicker;
    
    DateTimeFormatter formatter;
    
    FunctionData functionData;
    
    public RegisterFunctions() throws ClassNotFoundException, IOException, ParseException {
    	functionData = new FunctionData();
    }

    @FXML
    void registerFunction(ActionEvent event) throws Exception {
    	
    	formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd");
    	LocalDate localDate = datePicker.getValue();
    	
    	String dateString = localDate.format(formatter);
    	String functionHour = functionHoursCB.getSelectionModel().getSelectedItem();
    	String functionMinutes = functionMinutesCB.getSelectionModel().getSelectedItem();
    	
        dateString += ":"+functionHour+":"+functionMinutes;
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd:HH:mm");
        Date date = sdf.parse(dateString);
        
        String movieName = nameFunctionTF.getText();
        
        double durationHour = Double.parseDouble(durationHoursCB.getSelectionModel().getSelectedItem());
        double durationMinutes = Double.parseDouble(durationMinutesCB.getSelectionModel().getSelectedItem());
        
        double duration = durationHour + (durationMinutes/60);
		duration = duration*3600;
        
		String roomType = roomCB.getSelectionModel().getSelectedItem();
		
        Function function = new Function(movieName,roomType,date,duration);
        
        boolean added = functionData.addFunction(function);
        
        if(added) {
        	Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Success");
            alert.setContentText("Added");
            alert.showAndWait();
            FXMLLoader loader = new FXMLLoader(Entry.class.getResource("../ui/Menu.fxml"));
    		loader.setController(new Menu());
    		Parent parent = (Parent) loader.load();
    		Stage stage = new Stage();
    		Scene scene = new Scene(parent);
    		stage.setScene(scene);
    		stage.show();
    		
    		Stage stage1 = (Stage) doneBTN.getScene().getWindow();
    	    stage1.close();
            
            
        } else {
        	Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Couldn't be added");
            alert.showAndWait();
        }
        
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		createFunctionHoursCB();
		createFunctionMinutesCB();
		createDurationHoursCB();
		createDurationMinutesCB();
		createRoomCB();
	}
	
	public void createFunctionHoursCB() {
		functionHoursCB.getItems().add("0");
		functionHoursCB.getItems().add("1");
		functionHoursCB.getItems().add("2");
		functionHoursCB.getItems().add("3");
		functionHoursCB.getItems().add("4");
		functionHoursCB.getItems().add("5");
		functionHoursCB.getItems().add("6");
		functionHoursCB.getItems().add("7");
		functionHoursCB.getItems().add("8");
		functionHoursCB.getItems().add("9");
		functionHoursCB.getItems().add("10");
		functionHoursCB.getItems().add("11");
		functionHoursCB.getItems().add("12");
		functionHoursCB.getItems().add("13");
		functionHoursCB.getItems().add("14");
		functionHoursCB.getItems().add("15");
		functionHoursCB.getItems().add("16");
		functionHoursCB.getItems().add("17");
		functionHoursCB.getItems().add("18");
		functionHoursCB.getItems().add("19");
		functionHoursCB.getItems().add("20");
		functionHoursCB.getItems().add("21");
		functionHoursCB.getItems().add("22");
		functionHoursCB.getItems().add("23");
	}
	
	public void createFunctionMinutesCB() {
		functionMinutesCB.getItems().add("0");
		functionMinutesCB.getItems().add("1");
		functionMinutesCB.getItems().add("2");
		functionMinutesCB.getItems().add("3");
		functionMinutesCB.getItems().add("4");
		functionMinutesCB.getItems().add("5");
		functionMinutesCB.getItems().add("6");
		functionMinutesCB.getItems().add("7");
		functionMinutesCB.getItems().add("8");
		functionMinutesCB.getItems().add("9");
		functionMinutesCB.getItems().add("10");
		functionMinutesCB.getItems().add("11");
		functionMinutesCB.getItems().add("12");
		functionMinutesCB.getItems().add("13");
		functionMinutesCB.getItems().add("14");
		functionMinutesCB.getItems().add("15");
		functionMinutesCB.getItems().add("16");
		functionMinutesCB.getItems().add("17");
		functionMinutesCB.getItems().add("18");
		functionMinutesCB.getItems().add("19");
		functionMinutesCB.getItems().add("20");
		functionMinutesCB.getItems().add("21");
		functionMinutesCB.getItems().add("22");
		functionMinutesCB.getItems().add("23");
		functionMinutesCB.getItems().add("24");
		functionMinutesCB.getItems().add("25");
		functionMinutesCB.getItems().add("26");
		functionMinutesCB.getItems().add("27");
		functionMinutesCB.getItems().add("28");
		functionMinutesCB.getItems().add("29");
		functionMinutesCB.getItems().add("30");
		functionMinutesCB.getItems().add("31");
		functionMinutesCB.getItems().add("32");
		functionMinutesCB.getItems().add("33");
		functionMinutesCB.getItems().add("34");
		functionMinutesCB.getItems().add("35");
		functionMinutesCB.getItems().add("36");
		functionMinutesCB.getItems().add("37");
		functionMinutesCB.getItems().add("38");
		functionMinutesCB.getItems().add("39");
		functionMinutesCB.getItems().add("40");
		functionMinutesCB.getItems().add("41");
		functionMinutesCB.getItems().add("42");
		functionMinutesCB.getItems().add("43");
		functionMinutesCB.getItems().add("44");
		functionMinutesCB.getItems().add("45");
		functionMinutesCB.getItems().add("46");
		functionMinutesCB.getItems().add("47");
		functionMinutesCB.getItems().add("48");
		functionMinutesCB.getItems().add("49");
		functionMinutesCB.getItems().add("50");
		functionMinutesCB.getItems().add("51");
		functionMinutesCB.getItems().add("52");
		functionMinutesCB.getItems().add("53");
		functionMinutesCB.getItems().add("54");
		functionMinutesCB.getItems().add("55");
		functionMinutesCB.getItems().add("56");
		functionMinutesCB.getItems().add("57");
		functionMinutesCB.getItems().add("58");
		functionMinutesCB.getItems().add("59");
	}
	
	public void createDurationHoursCB() {
		durationHoursCB.getItems().add("0");
		durationHoursCB.getItems().add("1");
		durationHoursCB.getItems().add("2");
		durationHoursCB.getItems().add("3");
		durationHoursCB.getItems().add("4");
		durationHoursCB.getItems().add("5");
		durationHoursCB.getItems().add("6");
		durationHoursCB.getItems().add("7");
		durationHoursCB.getItems().add("8");
		durationHoursCB.getItems().add("9");
		durationHoursCB.getItems().add("10");
		durationHoursCB.getItems().add("11");
		durationHoursCB.getItems().add("12");
		durationHoursCB.getItems().add("13");
		durationHoursCB.getItems().add("14");
		durationHoursCB.getItems().add("15");
		durationHoursCB.getItems().add("16");
		durationHoursCB.getItems().add("17");
		durationHoursCB.getItems().add("18");
		durationHoursCB.getItems().add("19");
		durationHoursCB.getItems().add("20");
		durationHoursCB.getItems().add("21");
		durationHoursCB.getItems().add("22");
		durationHoursCB.getItems().add("23");
	}
	
	public void createDurationMinutesCB() {
		durationMinutesCB.getItems().add("0");
		durationMinutesCB.getItems().add("1");
		durationMinutesCB.getItems().add("2");
		durationMinutesCB.getItems().add("3");
		durationMinutesCB.getItems().add("4");
		durationMinutesCB.getItems().add("5");
		durationMinutesCB.getItems().add("6");
		durationMinutesCB.getItems().add("7");
		durationMinutesCB.getItems().add("8");
		durationMinutesCB.getItems().add("9");
		durationMinutesCB.getItems().add("10");
		durationMinutesCB.getItems().add("11");
		durationMinutesCB.getItems().add("12");
		durationMinutesCB.getItems().add("13");
		durationMinutesCB.getItems().add("14");
		durationMinutesCB.getItems().add("15");
		durationMinutesCB.getItems().add("16");
		durationMinutesCB.getItems().add("17");
		durationMinutesCB.getItems().add("18");
		durationMinutesCB.getItems().add("19");
		durationMinutesCB.getItems().add("20");
		durationMinutesCB.getItems().add("21");
		durationMinutesCB.getItems().add("22");
		durationMinutesCB.getItems().add("23");
		durationMinutesCB.getItems().add("24");
		durationMinutesCB.getItems().add("25");
		durationMinutesCB.getItems().add("26");
		durationMinutesCB.getItems().add("27");
		durationMinutesCB.getItems().add("28");
		durationMinutesCB.getItems().add("29");
		durationMinutesCB.getItems().add("30");
		durationMinutesCB.getItems().add("31");
		durationMinutesCB.getItems().add("32");
		durationMinutesCB.getItems().add("33");
		durationMinutesCB.getItems().add("34");
		durationMinutesCB.getItems().add("35");
		durationMinutesCB.getItems().add("36");
		durationMinutesCB.getItems().add("37");
		durationMinutesCB.getItems().add("38");
		durationMinutesCB.getItems().add("39");
		durationMinutesCB.getItems().add("40");
		durationMinutesCB.getItems().add("41");
		durationMinutesCB.getItems().add("42");
		durationMinutesCB.getItems().add("43");
		durationMinutesCB.getItems().add("44");
		durationMinutesCB.getItems().add("45");
		durationMinutesCB.getItems().add("46");
		durationMinutesCB.getItems().add("47");
		durationMinutesCB.getItems().add("48");
		durationMinutesCB.getItems().add("49");
		durationMinutesCB.getItems().add("50");
		durationMinutesCB.getItems().add("51");
		durationMinutesCB.getItems().add("52");
		durationMinutesCB.getItems().add("53");
		durationMinutesCB.getItems().add("54");
		durationMinutesCB.getItems().add("55");
		durationMinutesCB.getItems().add("56");
		durationMinutesCB.getItems().add("57");
		durationMinutesCB.getItems().add("58");
		durationMinutesCB.getItems().add("59");
	}

	public void createRoomCB() {
		roomCB.getItems().add("Mini room");
		roomCB.getItems().add("Medium room");
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
