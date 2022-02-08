package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.NegativeNumberException;
import model.Recipe;

public class RecipeTest {
private Recipe recipe;

	//First scenario method
	public void setupStage1() {
		recipe = new Recipe();
	}
	
	//Second scenario method
	public void setupStage2() {	
		recipe = new Recipe();
		recipe.addIngredient("Cebolla", 315);
		recipe.addIngredient("Ajo", 58);
		recipe.addIngredient("Arroz", 520);

		
	}
	
	//First test of the second table
	@Test
	public void addIngredientTest(){
		
		String n = "Sal";
		double w = 12;
		
		setupStage1();

		
		recipe.addIngredient(n, w);
				
		assertEquals(recipe.getIngredients().get(0).getName(), n);
		assertEquals(recipe.getIngredients().get(0).getWeight(), w, 0.001);
		
	}
	
	//Second test of the second table
	@Test
	public void addIngredientSecondTest(){	
		String n = "Pimienta";
		double w = 6;
		
		setupStage2();
		
		recipe.addIngredient(n, w);
				
		assertEquals(recipe.getIngredients().get(3).getName(), n);
		assertEquals(recipe.getIngredients().get(3).getWeight(), w, 0.001);
		
	}
	
	//Third test of the second table
	@Test
	public void addIngredientThirdTest() {
		
		setupStage2();
		
		String n = "Ajo";
		double w = 21;
			
		try {
			recipe.getIngredients().get(1).addWeight(w);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(recipe.getIngredients().get(1).getName(), n);
		assertEquals(recipe.getIngredients().get(1).getWeight(), 79, 0.001);
		
	}
	
	//The last test of the second table
	@Test
	public void removeIngredientTest() {
		setupStage2();
		
		String n = "Ajo";
		
		recipe.removeIngredient(n);
		
		assertEquals(recipe.getIngredients().get(1).getName(), "Arroz");
		assertEquals(recipe.getIngredients().get(1).getWeight(), 520, 0.001);
		
	}
}
