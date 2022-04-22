package model;

import java.util.Date;

public class Function {
	private String movieName;
	public Room room;
	private Date date;
	private double duration;
	
	public Room asignRoom(String roomType) {
		Room room = null;
		
		if(roomType.equalsIgnoreCase("Mini Room")) {
			room = new MiniRoom();
		} else if(roomType.equalsIgnoreCase("Medium Room")) {
			room = new MediumRoom();
		}
		return room;
	}
	
	public Function(String movieName, String roomType, Date date, double duration) {
		this.movieName = movieName;
		this.room = asignRoom(roomType);
		this.date = date;
		this.duration = duration;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public String getRoomType() {
		String roomType = "";
		
		if(this.room instanceof MiniRoom) {
			roomType = "Mini Room";
		} else if(this.room instanceof MediumRoom) {
			roomType = "Medium Room";
		}
		return roomType;
		
	}
	
}
