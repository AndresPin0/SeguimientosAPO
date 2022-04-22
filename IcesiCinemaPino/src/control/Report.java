package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.google.gson.Gson;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import model.Function;
import model.FunctionData;

public class Report implements Initializable{

    @FXML
    private TextArea reportTA;
    
    private ArrayList<Function> fc = new ArrayList<>();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		loadJSON();
		
		String text = "";
		int a = 1;

		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 
		
		
		for(Function f : fc) {
		
			text += a+" . "+f.getMovieName()+" | "+sdf.format(f.getDate())+" | "+f.getRoomType()+"\n";
			
			for(int i = 0; i<f.room.getSizeX(); i++) {
				for(int j = 0; j<f.room.getSizeY(); j++) {
					if(f.room.clients[i][j]!=null) {
						text += f.room.clients[i][j].getName()+"\n";
					}
				}
			}
			text += "\n\n";
			a++;
		}
		
		reportTA.setText(text);
	}
    
    public void loadJSON() {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(new File("data.json"));
			

			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String line;
			String json = "";
			while((line = br.readLine())!=null) {
				json += line;
			}
				
			Gson gson = new Gson();
			
			FunctionData loadingData = gson.fromJson(json,FunctionData.class);
			
			if(loadingData!=null) {
				this.fc = loadingData.functions;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}