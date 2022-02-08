package model;

import java.util.ArrayList;
import java.util.List;
import exception.NegativeNumberException;

public class Recipe {
	
	//List to add ingredients to the recipe object
	private List<Ingredient> ingredients;
	
	//Recipe constructor
	public Recipe() {
		//ArrayList for ingredients with the object of the class Ingredients
		ingredients = new ArrayList<Ingredient>();
	}
	
	//Method to add an ingredient by looking at the name is null
	public void addIngredient(String n, double w) {
		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}
		
		if(searched!=null) {
			try {
				searched.addWeight(w);
			} catch (NegativeNumberException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}
	
	//This method remove all values of this object
	public void removeIngredient(String n) {
		
		for(int i = 0; i < ingredients.size(); i++) {
			if(ingredients.get(i).getName().equals(n)) {
				ingredients.remove(i);
			}
		}
	}
	
	//Initialize the list
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
}

