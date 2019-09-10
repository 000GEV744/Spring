package ibm.fsd.spring_JDBCtemplate_demo_5th_aug_19.bean;

public class Employees {

	private String firstName;
	private String lastName;
	private String email;
	
	
	public Employees(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employees [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
