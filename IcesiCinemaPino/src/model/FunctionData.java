package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.Gson;


public class FunctionData {
	
	public ArrayList<Function> functions;
	
	private String path;
	private File file;
	
	public FunctionData() throws ClassNotFoundException, IOException, ParseException {
		this.functions = new ArrayList<>();
		this.path = "Functions.csv";
		importCSV();
	}
	
	public void importCSV() throws IOException, ClassNotFoundException, ParseException {
		
		file = new File(this.path);
		
		if(file.exists()) {
			functions.clear();
			FileReader fr = new FileReader(this.path);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			int i = 0;
			
			Date date;
			Double duration;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd:HH:mm");
			
			while((line = br.readLine()) != null) {

				if(i>0) {
					String[] function = line.split("\\|");
					
	                String movieName = function[0];
	                String room = function[1];
	                String dateString = function[2];
	                String hourString = function[3];
					String durationString = function[4];
	                
	                date = sdf.parse(dateString+":"+hourString);
	                
	                String durationData[] = durationString.split(":");
	                
	                duration = Double.parseDouble(durationData[0])*3600 + Double.parseDouble(durationData[1])*60;
	               
	                
	                functions.add(new Function(movieName, room, date, duration));
	   
				}
				
				i++;
			}
			
			if (br != null)br.close();
            if (fr != null)fr.close();
		}
		
		else {
			file.createNewFile();
			
			FileWriter fw=new FileWriter(file.getAbsoluteFile(), true);
        	BufferedWriter bw = new BufferedWriter(fw);
        	
            bw.write("Movie Name    |    Room Type    |    Date    | Hour | Duration");
            
            if (bw != null)bw.close();
            if (fw != null) fw.close();
			
		}
		

	}
	
	public boolean addFunction(Function function) throws IOException {
		
		boolean added = false;
		
		if(canAdd(function.getDate(),function.getDuration(),function.getRoom())) {
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
        	BufferedWriter bw = new BufferedWriter(fw);
        	
        	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy:MM:dd");
        	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
        	
        	String dateString = sdf1.format(function.getDate());
        	
        	String hourString = sdf2.format(function.getDate());
        	
        	int durationHour = (int) (function.getDuration()/3600);
        	
        	int durationMinutes = (int) ((function.getDuration()%3600)/60);
        	
            bw.write("\r"+function.getMovieName()+"|"+function.getRoom().toString()+"|"+dateString+"|"+hourString+"|"+durationHour+":"+durationMinutes);
            
            if (bw != null) bw.close();
            if (fw != null) fw.close();
			
            functions.add(function);
            
			added = true;
		}
		
		
		return added;
	}
	
	public boolean canAdd(Date date, double duration, Room room) {
		boolean addable = true;
		
		Date now = new Date();
		
		if(date.compareTo(now)<0) {
			addable = false;
		} 
		else {
			for(Function f : functions) {
				
				if(room.getName().equalsIgnoreCase(f.getRoom().getName())) {
					double addingInf = date.getTime()/1000;
					double addingSup = (date.getTime()/1000) + duration;
					
					double currentInf = f.getDate().getTime()/1000;
					double currentSup = (f.getDate().getTime()/1000) + f.getDuration();
					
					if(duration<=0) {
						addable = false;
					}
					
					//Si la pelicula comienza durante una que ya existe
					if(addingInf>currentInf && addingInf<currentSup) {
						addable = false;
					}
						
					//Si la pelicula termina durante una que ya existe
					if(addingSup>currentInf && addingSup<currentSup) {
						addable = false;
					}
						
						
					if(currentInf>addingInf && currentInf<addingSup) {
						addable = false;
					}
					
					if(currentInf>addingInf && currentSup<addingSup) {
						addable = false;
					}
					
					if(addingInf==currentInf && addingSup==currentSup) {
						addable = false;
					}	
				}
	
			}		
			
		}
		
		
		return addable;
	}
	
	public void saveJSON() {
		try {
			Gson gson = new Gson();
			String json = gson.toJson(this);
			File file = new File("data.json");
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(json.getBytes());
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadJSON() {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(new File("data.json"));
			

			BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
			
			String line;
			String json = "";
			while((line = reader.readLine())!=null) {
				json += line;
			}
				
			Gson gson = new Gson();
			
			FunctionData loadingData = gson.fromJson(json,FunctionData.class);
			
			if(loadingData!=null) {
				this.functions = loadingData.functions;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
