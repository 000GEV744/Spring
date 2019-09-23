package comm.example.spring.rest.dao;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comm.example.spring.rest.Customer;

@Repository
public class CustomerDAOIMPL implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;

	@PostConstruct
	public void init() {
		session = sessionFactory.openSession();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Customer> getAllCustomer() {
		
		Query query=session.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}
	@PreDestroy
	public void destroy()
	{
		session.close();
	}

}