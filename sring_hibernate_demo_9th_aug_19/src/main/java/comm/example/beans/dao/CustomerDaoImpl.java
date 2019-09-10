package comm.example.beans.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.example.beans.entity.Customer;

@Repository

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Customer> getCustomers() {
		Session  currentSession = sessionFactory.getCurrentSession();
		// create a query ... sort by last name
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);
		List<Customer> customers = theQuery.getResultList();
		return customers;	
	}

	@Transactional
	public void saveCustomer(Customer theCustomer) {
	
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theCustomer);		
	}

}
