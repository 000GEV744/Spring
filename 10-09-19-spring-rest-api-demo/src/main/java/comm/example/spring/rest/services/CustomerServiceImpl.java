package comm.example.spring.rest.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.example.spring.rest.Customer;
import comm.example.spring.rest.dao.CustomerDAO;
import comm.example.spring.rest.dao.CustomerDAO;;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO dao;

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

}