package ibm.fsd.spring_annotation_demo_4th_aug_19.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class EmployeesDao {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void createEmployee(Employees e) {
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement pst = connection.prepareStatement("insert into employees (firstName, lastName, email) values(?,?,?) ");
			pst.setString(1,e.getFirstName());
			pst.setString(2, e.getLastName());
			pst.setString(3,e.getEmail());
			pst.executeUpdate();
			System.out.println("inserted...!");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}
