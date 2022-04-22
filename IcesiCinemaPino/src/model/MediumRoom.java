package model;

public class MediumRoom extends Room{
	
	public MediumRoom() {
		this.sizeX = 6;
		this.sizeY = 7;
		this.name = "Medium room";
		clients = new Client[sizeX][sizeY];	
	}

	public String toString() {
		String room = "Medium room";
		
		return room;
	}
}
