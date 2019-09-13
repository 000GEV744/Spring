package com.example.springkhanakhajana.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String recipeNotes;
	@OneToOne
	@JoinColumn(name="Recipe_Id")
	private Recipe recipe;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRecipeNotes() {
		return recipeNotes;
	}
	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	
	
	public Notes(String recipeNotes) {
		super();
		this.recipeNotes = recipeNotes;
	}
	public Notes(String recipeNotes, Recipe recipe) {
		super();
		this.recipeNotes = recipeNotes;
		this.recipe = recipe;
	}
	
	public Notes() {
		super();
	}
	
	
}
