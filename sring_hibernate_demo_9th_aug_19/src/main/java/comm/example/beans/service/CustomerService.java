package comm.example.beans.service;

import java.util.List;

import comm.example.beans.entity.Customer;

public interface CustomerService {


	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
}
