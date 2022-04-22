package model;

public class MiniRoom extends Room{
	
	public MiniRoom() {
		this.sizeX = 4;
		this.sizeY = 7;
		this.name = "Medium room";
		clients = new Client[sizeX][sizeY];	
	}
	
	public String toString() {
		String room = "Mini room";
		
		return room;
	}
	
}
