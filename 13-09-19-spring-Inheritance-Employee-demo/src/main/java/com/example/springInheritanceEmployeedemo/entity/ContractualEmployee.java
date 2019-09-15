package com.example.springInheritanceEmployeedemo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Contractual Employee")
public class ContractualEmployee extends Employee {

	private int contractPeriod;
	private int hourlyPaid;
	
	
	
	public ContractualEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractualEmployee(String email, String firstName, String lastName,int contractPeriod,int hourlyPaid) {
		super(email, firstName, lastName);
		this.contractPeriod=contractPeriod;
		this.hourlyPaid=hourlyPaid;
	}

	public int getContractPeriod() {
		return contractPeriod;
	}
	
	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	
	public int getHourlyPaid() {
		return hourlyPaid;
	}
	
	public void setHourlyPaid(int hourlyPaid) {
		this.hourlyPaid = hourlyPaid;
	}
	
}
