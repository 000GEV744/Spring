package comm.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller

public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
		
	}

	@GetMapping("/getform")
	public String getForm(Model theModel) {
		Student student = new Student();
		theModel.addAttribute("student", student);
		return "student_details";
		
	}
	
	@PostMapping("/processform")
	public String formProcess(@ModelAttribute("student") Student theStudent,Model theModel) {
		theModel.addAttribute("student", theStudent);
		return "process-student";
		
	}
}
