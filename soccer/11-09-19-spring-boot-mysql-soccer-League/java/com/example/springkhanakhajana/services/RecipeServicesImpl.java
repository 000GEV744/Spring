package com.example.springkhanakhajana.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springkhanakhajana.model.Recipe;
import com.example.springkhanakhajana.repository.RecipeRepository;

@Service
public class RecipeServicesImpl implements RecipeServices {

    private RecipeRepository recipeRepository;
 
    
	public RecipeServicesImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}

	@Override
	public List<Recipe> getAllRecipe() {
		return recipeRepository.findAll();
	}

	@Override
	public void save(Recipe recipe) {
		recipeRepository.save(recipe);
		
	}

	@Override
	public Recipe findById(Long id) {
		Optional<Recipe> result = recipeRepository.findById(id);
		Recipe recipe =null;
		if(result.isPresent()) {
			recipe = result.get();
		}
		return recipe;
	}

	@Override
	public void deleteById(Long id) {
		recipeRepository.deleteById(id);
		
	}

}
