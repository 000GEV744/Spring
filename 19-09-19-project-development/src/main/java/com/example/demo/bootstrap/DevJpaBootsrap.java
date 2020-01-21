package com.example.demo.bootstrap;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Category;
import com.example.demo.entity.City;
import com.example.demo.entity.Product;
import com.example.demo.repository.*;


@Component
public class DevJpaBootsrap implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired private ProductRepository proRepo;
	@Autowired private CategoryRepository catRepo;
	@Autowired private CityRepository cityRepo;
	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}

	private void init() {
		//creating some cities where our services will be available
		City banglore = new City("Banglore");
		City Hyderabad = new City("Hyderabad");
		cityRepo.save(banglore);
		cityRepo.save(Hyderabad);
		
	    //defining categories
		Category appliances=new Category("Applicance");//category:appliances
		catRepo.save(appliances);
		Category furniture= new Category("Furnitures");//category:furniture
		
		Category vehicles = new Category("Vehicles");//category:vehicle
		
		
		
		
		//creating some sample products database which will be mapped with our categories using many to one relationship
		Product bed= new Product("Single Bed", "Single Bed Alpha 6X3", 159.00, 837.00, 20.00,"6*5", 0, 4, "https://www.google.com/imgres?");
		
	    Product scooty= new Product("Activa", "4 wheeler",700, 500, 15.5, "scooty", 0, 3,"http:localhost://image1");
	    
	    Product almirah= new Product("Godreg Almirah", "containing four doors with one locker", 300, 500, 10, "4*4 ", 0, 8, "c:/users/imag2");
	   
	    
	    
	   //adding the products to our category :Furniture
	   Set<Product> productsFurniture = new HashSet<Product>();
	   productsFurniture.add(bed);
	   productsFurniture.add(almirah);
	   furniture.setProducts(productsFurniture);
	   catRepo.save(furniture);//persisting the furniture
	   
	   //adding the products to our category :Vehicle
	   Set<Product> productsVehicle = new HashSet<Product>();
	   productsVehicle.add(scooty);
	   vehicles.setProducts(productsVehicle);
	   catRepo.save(vehicles);//persisting the vehicle
	    
	  //since it's bidirectional, we are mapping the products to their appropriate category
	    scooty.setCategory(vehicles);
	    almirah.setCategory(furniture);
	    bed.setCategory(furniture);
	   
	    
	    
	    
	    /*persisting the products in the last because
	      the foreign key in product table will refer to 
	      the primary key of the category database*/
	    proRepo.save(bed);
	    proRepo.save(almirah);
	    proRepo.save(scooty);
	    
	    //saving the products which are being on rent in city:banglore
	    Set<Product> productsBanglore = new HashSet<Product>();
	    productsBanglore.add(bed);
	    productsBanglore.add(almirah);
	    banglore.setProduct(productsBanglore);
	    cityRepo.save(banglore);
	    
	  //saving the products which are being on rent in city:hyderabad
	    Set<Product> productsHyd = new HashSet<Product>();
	    productsHyd.add(scooty);
	    Hyderabad.setProduct(productsHyd);
		cityRepo.save(Hyderabad);

	}
}