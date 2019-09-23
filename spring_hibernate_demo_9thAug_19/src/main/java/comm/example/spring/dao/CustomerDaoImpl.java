package comm.example.spring.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.example.spring.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	// need to inject the session factory
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
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();

				// create a query ... sort by last name
				Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);

				// execute query and get result list
				List<Customer> customers = theQuery.getResultList();

				// return the results
				return customers;
	}

	
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// save the customer ... finally LOL
		currentSession.save(theCustomer);		
	}

	
	@Transactional
	public Customer findById(int cId) {
		Session currentSession = sessionFactory.getCurrentSession();
		//get the student by its id 
		Customer customer=currentSession.find(Customer.class,cId);
		return customer;
	}

	@Transactional
	public void UpdateById(Customer c,int cId) {
		Session currentSession = sessionFactory.getCurrentSession();
		//updating the student values
		Query<Customer> q  = currentSession.createQuery("update Customer set firstName= :fname,lastName= :lname,email= :email where id= :id", Customer.class);
		q.setParameter("fname",c.getFirstName());
		q.setParameter("lname",c.getLastName());
		q.setParameter("email",c.getEmail());
		q.setParameter("id",cId);
		q.executeUpdate();
	
	}

	
	
}