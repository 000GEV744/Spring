package comm.example.spring.rest.dao;
import java.util.List;

import comm.example.spring.rest.Customer;

public interface CustomerDAO {

	List<Customer> getAllCustomer();

}