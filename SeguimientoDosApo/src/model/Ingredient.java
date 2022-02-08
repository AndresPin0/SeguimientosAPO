package model;
import exception.NegativeNumberException;

public class Ingredient {
	//The name of ingredient
	private String name;
	
	//The weight of the ingredients
	private double weight;
	
	
	//Constructor for initialize variables
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	//Getter of name
	public String getName() {
		return name;
	}
	
	//Getter of weight
	public double getWeight() {
		return weight;
	}
	
	//Method that plus the original weight
	public void addWeight(double additionalW) throws NegativeNumberException {
		if(additionalW < 0) {
    		throw new NegativeNumberException(weight);
    	}
		weight += additionalW;
	}
	
	//Method that removes weight from an ingredient (It cannot be negative) 
	public void removeWeight(double inputW) throws NegativeNumberException{
		if(inputW < 0) {
    		throw new NegativeNumberException(weight);
    	}
		weight -= inputW;
	}
	
}
