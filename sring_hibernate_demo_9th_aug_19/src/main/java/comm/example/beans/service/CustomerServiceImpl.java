package comm.example.beans.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.example.beans.dao.CustomerDaoImpl;
import comm.example.beans.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDaoImpl dao;
	
	
	public CustomerDaoImpl getDao() {
		return dao;
	}

	public void setDao(CustomerDaoImpl dao) {
		this.dao = dao;
	}

	public List<Customer> getCustomers() {
		List<Customer> listOfCustomer = dao.getCustomers();
		return listOfCustomer;
	}
	
	public void saveCustomer(Customer theCustomer) {
		dao.saveCustomer(theCustomer);
	}

}
