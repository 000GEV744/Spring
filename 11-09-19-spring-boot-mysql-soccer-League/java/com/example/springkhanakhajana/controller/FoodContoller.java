package com.example.springkhanakhajana.controller;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springkhanakhajana.model.Ingredient;
import com.example.springkhanakhajana.model.Notes;
import com.example.springkhanakhajana.model.Recipe;
import com.example.springkhanakhajana.repository.IngredientRepository;
import com.example.springkhanakhajana.repository.NotesRepository;
import com.example.springkhanakhajana.services.RecipeServices;

@Controller
@RequestMapping("/recipe")
public class FoodContoller {

	private RecipeServices recipeServices;
	private NotesRepository notesRepository;
    private IngredientRepository ingredientRepository;
   

	public FoodContoller(RecipeServices recipeServices, NotesRepository notesRepository,
			IngredientRepository ingredientRepository) {
		super();
		this.recipeServices = recipeServices;
		this.notesRepository = notesRepository;
		this.ingredientRepository = ingredientRepository;
	}


	@GetMapping("/listRecipe")
	public String getAllRecipe(Model m) {
		List<Recipe> recipe = recipeServices.getAllRecipe();
		m.addAttribute("Recipe", recipe);
		return "recipe/list-recipe";
	}
	
	
	@GetMapping("/delete")
	public String deleteRecipe(@RequestParam("id") Long id) {
		
		recipeServices.deleteById(id);
		return "redirect:/recipe/listRecipe";
	}
	
	@GetMapping("/view")
	public String viewingredients(@RequestParam("id") Long id, Model m) {
		
		Recipe recipe=recipeServices.findById(id);
		Notes note=recipe.getNote();
		m.addAttribute("Note", note); //sending notes
		Set<Ingredient> ingredients = recipe.getIngredient();
		m.addAttribute("Ingredient",ingredients);//sending ingredients <having set of ingredients>
		m.addAttribute("Recipe",recipe);//sending recipe
		return "recipe/view-description";
	}

	
}
