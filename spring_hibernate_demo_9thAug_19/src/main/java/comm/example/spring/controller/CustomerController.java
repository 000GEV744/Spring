package comm.example.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comm.example.spring.entity.Customer;
import comm.example.spring.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject our customer service
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		// get customers from the service
		List<Customer> theCustomers = customerService.getCustomers();	
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		// save the customer using our service
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/update")
	public String updateCustomer(@RequestParam("id") int id,Model m) {
		m.addAttribute("UCustomer",customerService.findById(id));
		return "customer-update";
	}
	
	@PostMapping("/customerUpdated")
	public String customerUpdated(@ModelAttribute("customer") Customer c,@RequestParam("id") int id) {
		customerService.UpdateById(c, id);
		return null;
		
	}
	
	
}