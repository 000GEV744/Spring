package com.example.springkhanakhajana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springkhanakhajana.model.Recipe;
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
