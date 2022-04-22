package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.Gson;

public class Room {
	protected int sizeX;
	protected int sizeY;
	protected String name;
	public Client clients[][];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClientName(int x, int y) {
		String clientName = clients[x][y].getName();
		return clientName;
	}
	
	public boolean isAvailable(int x, int y) {
		boolean available = true;
		if(clients[x][y]!=null) {
			available = false;
		}
		return available;
	}
	
	public void assingClient(Client client, int x, int y) {
		clients[x][y] = client;
	}
	public int getSizeX() {
		return sizeX;
	}
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	
	public void saveJSON() {
		try {
			Gson gson = new Gson();
			String json = gson.toJson(this);
			System.out.println(json);
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
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String line;
			String json = "";
			while((line = br.readLine())!=null) {
				json += line;
			}
			
			System.out.println(json);
			
			Gson gson = new Gson();
			Room loadingRoom = gson.fromJson(json,Room.class);
			
			this.clients = loadingRoom.clients;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
