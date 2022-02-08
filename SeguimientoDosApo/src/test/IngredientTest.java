package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.NegativeNumberException;

import model.Ingredient;

public class IngredientTest {
	private Ingredient ingredient;
	
	//First scenario method
	public void setupStage1() {
		ingredient = new Ingredient("Tomate", 245);
	}
	
	@Test
	public void testAddPositiveWeight() throws NegativeNumberException {
		
		double w = 54;
		
		setupStage1();
		ingredient.addWeight(w);
		
		assertEquals(ingredient.getWeight(), 299, 0.001);
		
	}
	
	@Test
	public void testAddNegativeWeight() throws NegativeNumberException {
		double w = -100;
		
		setupStage1();
		ingredient.addWeight(w);
		
		assertEquals(ingredient.getWeight(), 245, 0.001);
		
	}
	
	@Test
	public void testRemovePositiveWeight() throws NegativeNumberException {
		double w = 45;
		
		setupStage1();
		ingredient.removeWeight(w);

		assertEquals(ingredient.getWeight(), 200, 0.001);
		
	}
	
	@Test
	public void testRemoveWeightNegative() throws NegativeNumberException{
		double w = -100;
		
		setupStage1();
		ingredient.removeWeight(w);

		assertEquals(ingredient.getWeight(), 245, 0.001);
	}
	

}
