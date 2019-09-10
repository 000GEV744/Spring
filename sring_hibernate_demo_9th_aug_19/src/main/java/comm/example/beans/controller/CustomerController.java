package comm.example.beans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.example.beans.entity.Customer;
import comm.example.beans.service.CustomerServiceImpl;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerService;
	
	
	
	public CustomerServiceImpl getCustomerService() {
		return customerService;
	}


	public void setCustomerService(CustomerServiceImpl customerService) {
		this.customerService = customerService;
	}


	//listing all the customers from the database
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the service
		List<Customer> theCustomers = customerService.getCustomers();		
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	
	//inserting the customer details into the database and then redirecting to the list page
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		// save the customer using our service
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
	
}
