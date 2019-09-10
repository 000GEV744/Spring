package ibm.fsd.spring_demo_4th_aug_19.bean;

public class Employee {

	 private String firstName;
	 private int id;
	 private String lastName;
	 private String email;
	 
	public Employee() {
		super();
	}

	public Employee(String firstName, int id, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.id = id;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Employee [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	


}

