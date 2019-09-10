package ibm.fsd.spring_javaConfig_demo_5thAug_19.bean.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ibm.fsd.spring_javaConfig_demo_5thAug_19.bean.Employee;
import ibm.fsd.spring_javaConfig_demo_5thAug_19.bean.EmployeeRowMapper;


public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public  String addEmployee(Employee emp) {
		
		jdbcTemplate.update("insert into employees (firstName, lastName, email) values(?,?,?)",emp.getFirstName(),emp.getLastName(),emp.getEmail() );
		return "employee added !";
		
	}

	public void editEmployee(Employee emp, int empId) {
		jdbcTemplate.update("update employees set firstName=?, lastname=?, email=? where id = ?",emp.getFirstName(),emp.getLastName(),emp.getEmail(),empId);
		System.out.println("updated !");
		
	}

	public void deleteEmployee(int empId) {
	
		jdbcTemplate.update("delete from employees where id = ?", empId);
		System.out.println("deleted !");
		
	}

	public Employee find(int empId) {
		 Object[] obj = {empId};
		 return (Employee) jdbcTemplate.query("select * from employees where id=?",obj, new EmployeeRowMapper());	
	}

	public List<Employee> findAll() {
		
		 List<Employee> empList=new ArrayList<Employee>();
		 empList=jdbcTemplate.query("select * from employees", new EmployeeRowMapper());
		 return empList;
	}

}
