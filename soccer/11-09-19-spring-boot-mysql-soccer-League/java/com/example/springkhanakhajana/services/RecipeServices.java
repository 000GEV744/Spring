package com.example.springkhanakhajana.services;

import java.util.List;

import com.example.springkhanakhajana.model.Recipe;


public interface RecipeServices {
		
	    public List<Recipe> getAllRecipe();
		public void save(Recipe recipe);
		public Recipe findById(Long id);
		public void deleteById(Long id);

}
