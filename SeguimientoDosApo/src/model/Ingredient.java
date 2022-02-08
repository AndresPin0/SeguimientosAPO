package model;
import exception.NegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException {
		if(additionalW < 0) {
    		throw new NegativeNumberException(weight);
    	}
		weight += additionalW;
	}
	
	public void removeWeight(double inputW) throws NegativeNumberException{
		if(inputW < 0) {
    		throw new NegativeNumberException(weight);
    	}
		weight -= inputW;
	}
	
}
