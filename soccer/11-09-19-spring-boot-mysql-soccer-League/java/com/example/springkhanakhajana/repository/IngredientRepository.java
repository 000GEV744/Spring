package com.example.springkhanakhajana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springkhanakhajana.model.Ingredient;
@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
