package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.NegativeNumberException;

import model.Ingredient;

public class IngredientTest {
	//Initialize the object of ingredient
	private Ingredient ingredient;
	
	//First scenario method
	public void setupStage1() {
		ingredient = new Ingredient("Tomate", 245);
	}
	
	//The first test of the table 
	@Test
	public void testAddPositiveWeight() throws NegativeNumberException {
		
		double w = 54;
		
		setupStage1();
		ingredient.addWeight(w);
		
		assertEquals(ingredient.getWeight(), 299, 0.001);
		
	}
	
	//The second test of the table
	@Test
	public void testAddNegativeWeight() throws NegativeNumberException {
		double w = -100;
		
		setupStage1();
		ingredient.addWeight(w);
		
		assertEquals(ingredient.getWeight(), 245, 0.001);
		
	}
	
	//Third test of the table
	@Test
	public void testRemovePositiveWeight() throws NegativeNumberException {
		double w = 45;
		
		setupStage1();
		ingredient.removeWeight(w);

		assertEquals(ingredient.getWeight(), 200, 0.001);
		
	}
	
	
	//Forth test of the table
	@Test
	public void testRemoveWeightNegative() throws NegativeNumberException{
		double w = -100;
		
		setupStage1();
		ingredient.removeWeight(w);

		assertEquals(ingredient.getWeight(), 245, 0.001);
	}
}
