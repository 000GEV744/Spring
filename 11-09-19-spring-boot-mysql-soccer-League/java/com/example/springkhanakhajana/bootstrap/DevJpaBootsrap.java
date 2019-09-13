package com.example.springkhanakhajana.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springkhanakhajana.model.Ingredient;
import com.example.springkhanakhajana.model.Notes;
import com.example.springkhanakhajana.model.Recipe;
import com.example.springkhanakhajana.repository.IngredientRepository;
import com.example.springkhanakhajana.repository.NotesRepository;
import com.example.springkhanakhajana.repository.RecipeRepository;

@Component
public class DevJpaBootsrap implements ApplicationListener<ContextRefreshedEvent> {

	private RecipeRepository reciperepository;
	private NotesRepository notesRepository;
	private IngredientRepository ingredientRepository;
	
	
	
	public DevJpaBootsrap(RecipeRepository reciperepository, NotesRepository notesRepository,
			IngredientRepository ingredientRepository) {
		super();
		this.reciperepository = reciperepository;
		this.notesRepository = notesRepository;
		this.ingredientRepository = ingredientRepository;
	}

	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}

	private void init() {
		Notes note=new Notes("use oil to create a soft idli");
		Recipe idli = new Recipe("1 hour", "Idli","Moderate","north-east","30 min", 4, "youtube","https://www.youtube.com/watch?v=xU5T4oZOcNw",note);
		notesRepository.save(note);
		
		
		Ingredient daal = new Ingredient("200gm","boil it for 20 min ");
		Ingredient coconut = new Ingredient("2 piece","make its chutney");
		idli.getIngredient().add(daal);
		idli.getIngredient().add(coconut);
		
		reciperepository.save(idli);
		note.setRecipe(idli);
		notesRepository.save(note);
		daal.setRecipe(idli);
		coconut.setRecipe(idli);
		ingredientRepository.save(daal);
		ingredientRepository.save(coconut);
		
		
		
		//crreating second recipe
		
		Notes note1=new Notes("use oil to create a soft idli");
		Recipe maggie = new Recipe("2 min", "Maggie","Easy","north-east","30 min", 4, "youtube","https://www.youtube.com/watch?v=xU5T4oZOcNw",note);
		notesRepository.save(note1);
		
		
		Ingredient water= new Ingredient("200gm","boil it for 1 min ");
		Ingredient masala = new Ingredient("1 piece","mix it well into hot water");
		idli.getIngredient().add(water);
		idli.getIngredient().add( masala);
		
		reciperepository.save(maggie);
		note1.setRecipe(maggie);
		notesRepository.save(note1);
		water.setRecipe(maggie);
		masala.setRecipe(maggie);
		ingredientRepository.save(water);
		ingredientRepository.save(masala);
		
	}
}
