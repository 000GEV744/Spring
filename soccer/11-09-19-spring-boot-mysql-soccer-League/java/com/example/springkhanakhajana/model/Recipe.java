package com.example.springkhanakhajana.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private String cookTime;
	private String description;
	private String difficulty;
	private String direction;
	private String prepTime;
	private int servings;
	private String source;
	private String url;
	
	@OneToOne
	private Notes note;
	
	@OneToMany(mappedBy = "recipe",cascade=CascadeType.ALL)
	private Set<Ingredient> ingredient=new HashSet<Ingredient>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public String getCookTime() {
		return cookTime;
	}

	public void setCookTime(String cookTime) {
		this.cookTime = cookTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(String prepTime) {
		this.prepTime = prepTime;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Notes getNote() {
		return note;
	}

	public void setNote(Notes note) {
		this.note = note;
	}

	public Set<Ingredient> getIngredient() {
		return ingredient;
	}

	public void setIngredient(Set<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public Recipe(String cookTime, String description, String difficulty, String direction, String prepTime,
			int servings, String source, String url, Notes note) {
		super();
		this.cookTime = cookTime;
		this.description = description;
		this.difficulty = difficulty;
		this.direction = direction;
		this.prepTime = prepTime;
		this.servings = servings;
		this.source = source;
		this.url = url;
		this.note = note;
		
	}

	
	public Recipe() {
		super();
	}

	
	
}
