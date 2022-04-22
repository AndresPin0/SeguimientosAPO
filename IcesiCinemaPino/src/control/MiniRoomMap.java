package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Client;
import model.Function;
import model.FunctionData;

public class MiniRoomMap implements Initializable{
	
	
	private Client client;
	private Function function;
	private FunctionData functionData;
	
	public MiniRoomMap(Client client, Function function, FunctionData functionData) {
		this.client = client;
		this.function = function;
		this.functionData = functionData;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

    @FXML
    private Button sillaA1BTN;

    @FXML
    private Button sillaA2BTN;

    @FXML
    private Button sillaA3BTN;

    @FXML
    private Button sillaA4BTN;

    @FXML
    private Button sillaA5BTN;

    @FXML
    private Button sillaA6BTN;

    @FXML
    private Button sillaA7BTN;

    @FXML
    private Button sillaB1BTN;

    @FXML
    private Button sillaB2BTN;

    @FXML
    private Button sillaD7BTN;

    @FXML
    private Button sillaD6BTN;

    @FXML
    private Button sillaD5BTN;

    @FXML
    private Button sillaD4BTN;

    @FXML
    private Button sillaD3BTN;

    @FXML
    private Button sillaD2BTN;

    @FXML
    private Button sillaD1BTN;

    @FXML
    private Button sillaC7BTN;

    @FXML
    private Button sillaC1BTN;

    @FXML
    private Button sillaC6BTN;

    @FXML
    private Button sillaC5BTN;

    @FXML
    private Button sillaC4BTN;

    @FXML
    private Button sillaC3BTN;

    @FXML
    private Button sillaC2BTN;

    @FXML
    private Button sillaB7BTN;

    @FXML
    private Button sillaB6BTN;

    @FXML
    private Button sillaB5BTN;

    @FXML
    private Button sillaB4BTN;

    @FXML
    private Button sillaB3BTN;
    
    @FXML
    private Button doneBTN;

    @FXML
    void addSilla(ActionEvent event) {
    	if(event.getSource()==sillaA1BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 0);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaA1BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA2BTN) {
    		if(function.room.isAvailable(0, 1)) {
    			function.room.assingClient(client, 0, 1);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaA2BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA3BTN) {
    		if(function.room.isAvailable(0, 2)) {
    			function.room.assingClient(client, 0, 2);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaA3BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA4BTN) {
    		if(function.room.isAvailable(0, 3)) {
    			function.room.assingClient(client, 0, 3);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaA4BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA5BTN) {
    		if(function.room.isAvailable(0, 4)) {
    			function.room.assingClient(client, 0, 4);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaA5BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA6BTN) {
    		if(function.room.isAvailable(0, 5)) {
    			function.room.assingClient(client, 0, 5);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaA6BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA7BTN) {
    		if(function.room.isAvailable(0, 6)) {
    			function.room.assingClient(client, 0, 6);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaA7BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB1BTN) {
    		if(function.room.isAvailable(1, 0)) {
    			function.room.assingClient(client, 1, 0);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaB1BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB2BTN) {
    		if(function.room.isAvailable(1, 1)) {
    			function.room.assingClient(client, 1, 1);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaB2BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB3BTN) {
    		if(function.room.isAvailable(1, 2)) {
    			function.room.assingClient(client, 1, 2);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaB3BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB4BTN) {
    		if(function.room.isAvailable(1, 3)) {
    			function.room.assingClient(client, 1, 3);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaB4BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB5BTN) {
    		if(function.room.isAvailable(1, 4)) {
    			function.room.assingClient(client, 1, 4);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaB5BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB6BTN) {
    		if(function.room.isAvailable(1, 5)) {
    			function.room.assingClient(client, 1, 5);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaB6BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB7BTN) {
    		if(function.room.isAvailable(1, 6)) {
    			function.room.assingClient(client, 1, 6);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaB7BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC1BTN) {
    		if(function.room.isAvailable(2, 0)) {
    			function.room.assingClient(client, 2, 0);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaC1BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC2BTN) {
    		if(function.room.isAvailable(2, 1)) {
    			function.room.assingClient(client, 2, 1);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaC2BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC3BTN) {
    		if(function.room.isAvailable(2, 2)) {
    			function.room.assingClient(client, 2, 2);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaC3BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC4BTN) {
    		if(function.room.isAvailable(2, 3)) {
    			function.room.assingClient(client, 2, 3);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaC4BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC5BTN) {
    		if(function.room.isAvailable(2, 4)) {
    			function.room.assingClient(client, 2, 4);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaC5BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC6BTN) {
    		if(function.room.isAvailable(2, 5)) {
    			function.room.assingClient(client, 2, 5);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaC6BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC7BTN) {
    		if(function.room.isAvailable(2, 6)) {
    			function.room.assingClient(client, 2, 6);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaC7BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD1BTN) {
    		if(function.room.isAvailable(3, 0)) {
    			function.room.assingClient(client, 3, 0);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaD1BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD2BTN) {
    		if(function.room.isAvailable(3, 1)) {
    			function.room.assingClient(client, 3, 1);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaD2BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD3BTN) {
    		if(function.room.isAvailable(3, 2)) {
    			function.room.assingClient(client, 3, 2);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaD3BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD4BTN) {
    		if(function.room.isAvailable(3, 3)) {
    			function.room.assingClient(client, 3, 3);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaD4BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD5BTN) {
    		if(function.room.isAvailable(3, 4)) {
    			function.room.assingClient(client, 3, 4);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaD5BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD6BTN) {
    		if(function.room.isAvailable(3, 5)) {
    			function.room.assingClient(client, 3, 5);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaD6BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD7BTN) {
    		if(function.room.isAvailable(3, 6)) {
    			function.room.assingClient(client, 3, 6);
    			functionData.saveJSON();
    			successfullyAssignedChairlAlert();
    			sillaD7BTN.setStyle("-fx-background-radius: 5em; " +
    			        "-fx-min-width: 52px; " +
    			        "-fx-min-height: 52px; " +
    			        "-fx-max-width: 54px; " +
    			        "-fx-max-height: 54px; " +
    			        "-fx-background-color: #03226E;" +
    			        "-fx-background-insets: 0px; " +
    			        "-fx-padding: 0px;");
    		} else {
    			inUseChairAlert();
    		}
    	}
    }
    
    public void inUseChairAlert() {
    	Alert alert = new Alert(Alert.AlertType.ERROR);
	    alert.setHeaderText(null);
	    alert.setTitle("Error");
	    alert.setContentText("La silla  ya esta reservada.");
	    alert.showAndWait();
    }
    
    public void successfullyAssignedChairlAlert() {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    alert.setHeaderText(null);
	    alert.setTitle("Exito");
	    alert.setContentText("Reservada con exito");
	    alert.showAndWait();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(!function.room.isAvailable(0, 1)) {
			sillaA1BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(0, 1)) {
			sillaA2BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(0, 2)) {
			sillaA3BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(0, 3)) {
			sillaA4BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(0, 4)) {
			sillaA5BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(0, 5)) {
			sillaA6BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(0, 6)) {
			sillaA7BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(1, 0)) {
			sillaB1BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(1, 1)) {
			sillaB2BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(1, 2)) {
			sillaB3BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(1, 3)) {
			sillaB4BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(1, 4)) {
			sillaB5BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(1, 5)) {
			sillaB6BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(1, 6)) {
			sillaB7BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(2, 0)) {
			sillaC1BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(2, 1)) {
			sillaC2BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(2, 2)) {
			sillaC3BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(2, 3)) {
			sillaC4BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(2, 4)) {
			sillaC5BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(2, 5)) {
			sillaC6BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(2, 6)) {
			sillaC7BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(3, 0)) {
			sillaD1BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(3, 1)) {
			sillaD2BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(3, 2)) {
			sillaD3BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		}
		if(!function.room.isAvailable(3, 3)) {
			sillaD4BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(3, 4)) {
			sillaD5BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(3, 5)) {
			sillaD6BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
		} 
		if(!function.room.isAvailable(3, 6)) {
			sillaD7BTN.setStyle("-fx-background-radius: 5em; " +
			        "-fx-min-width: 52px; " +
			        "-fx-min-height: 52px; " +
			        "-fx-max-width: 54px; " +
			        "-fx-max-height: 54px; " +
			        "-fx-background-color: #03226E;" +
			        "-fx-background-insets: 0px; " +
			        "-fx-padding: 0px;");
    		
		}
		
	}
	
	@FXML
    void done(ActionEvent event) {
	    Stage stage1 = (Stage) doneBTN.getScene().getWindow();
	    stage1.close();

    }

}

