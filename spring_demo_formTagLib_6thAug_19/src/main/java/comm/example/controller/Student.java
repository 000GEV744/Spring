package comm.example.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String country;
	private StringBuffer osStr;
	private String setOStr;
	private LinkedHashMap<String,String> countryOptions;
	private String favoriteLanguage;
	private String[] os;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSetOStr() {
		return setOStr;
	}

	public void setSetOStr(String setOStr) {
		this.setOStr = setOStr;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		super();
		 countryOptions= new LinkedHashMap<String,String>();
		 countryOptions.put("BR", "Brazil");
		 countryOptions.put("IN", "India");
		 countryOptions.put("US", "United States of America");
		 countryOptions.put("FR", "France");
		 countryOptions.put("GR", "Germany");
	}
	
	

	public Student(String firstName, String lastName, String email, String country, StringBuffer osStr,
			String favoriteLanguage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.country = country;
		this.osStr = osStr;
		this.favoriteLanguage = favoriteLanguage;
	}

	public Student(String firstName, String lastName, String email, LinkedHashMap<String, String> countryOptions,
			String favoriteLanguage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.countryOptions = countryOptions;
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
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

	public StringBuffer getOsStr() {
		return osStr;
	}

	public void setOsStr(StringBuffer osStr) {
		this.osStr = osStr;
	}
	
}
