package comm.example.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.example.spring.dao.CustomerDao;
import comm.example.spring.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDao customerDAO;
	
	
	
	public CustomerDao getCustomerDAO() {
		return customerDAO;
	}

	
	public void setCustomerDAO(CustomerDao customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}


	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);		
	}

	@Transactional
	public Customer findById(int cId) {
		return customerDAO.findById(cId);
	}

	@Transactional
	public void UpdateById(Customer c, int cId) {
		customerDAO.UpdateById(c, cId);
		System.out.println("updated !");
	}

	
}