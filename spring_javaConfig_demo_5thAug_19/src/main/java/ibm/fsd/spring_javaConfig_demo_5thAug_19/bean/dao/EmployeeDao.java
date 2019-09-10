package ibm.fsd.spring_javaConfig_demo_5thAug_19.bean.dao;
import java.util.List;
import ibm.fsd.spring_javaConfig_demo_5thAug_19.bean.Employee;

public interface EmployeeDao {

	public String addEmployee(Employee emp);
    public void editEmployee(Employee emp, int empId);
    public void deleteEmployee(int empId);
    public Employee find(int empId);
    public List <Employee> findAll();
}
