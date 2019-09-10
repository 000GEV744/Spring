package comm.example.spring.services;

import java.util.List;

import comm.example.spring.entity.Customer;


public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	public void UpdateById(Customer c,int cId);

	public List<Customer> findById(int cId);
}

