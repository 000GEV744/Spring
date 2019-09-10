package comm.example.beans.dao;
import java.util.List;

import comm.example.beans.entity.*;
public interface CustomerDao {

	
	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
}
