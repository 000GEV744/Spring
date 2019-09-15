package com.example.springInheritanceEmployeedemo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Regular Employee")
public class RegularEmployee  extends Employee{

	private int comission;
	private int salary;
	
	
	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegularEmployee(String email, String firstName, String lastName,  int comission, int salary) {
		super(email, firstName, lastName);
		this.comission=comission;
		this.salary=salary;
		
	}
	public int getComission() {
		return comission;
	}
	public void setComission(int comission) {
		this.comission = comission;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
}
