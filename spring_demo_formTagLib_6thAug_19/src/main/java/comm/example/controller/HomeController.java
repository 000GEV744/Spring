package comm.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import comm.example.controller.services.StudentServicesImpl;
@Controller

public class HomeController {
	@Autowired
	StudentServicesImpl services ;
	
	public StudentServicesImpl getServices() {
		return services;
	}

	public void setServices(StudentServicesImpl services) {
		this.services = services;
	}

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
	
	//insert into student values
	@PostMapping("/processform")
	public String formProcess(@ModelAttribute("student") Student s,Model theModel) {
		
		StringBuffer str= new StringBuffer();
		for(String str1:s.getOs()) {
			str.append(str1+" ");
		}
		
		services.addStudent(new Student(s.getFirstName(),s.getLastName(),s.getEmail(),s.getCountry(),str,s.getFavoriteLanguage()));
		List<Student> listOfStudent=services.findAll();
		theModel.addAttribute("list",listOfStudent);
		return "all_employee_view";
		
	}
	
	//update student values
		@PostMapping("/update_details")
		public String updateDetails(@ModelAttribute("student") Student s,Model theModel,HttpServletRequest request) {
			int id=Integer.parseInt(request.getParameter("id"));
			StringBuffer str= new StringBuffer();
			for(String str1:s.getOs()) {
				str.append(str1+" ");
			}
			System.out.println(str);
			services.editStudent(new Student(s.getFirstName(),s.getLastName(),s.getEmail(),s.getCountry(),str,s.getFavoriteLanguage()),id);
			List<Student> listOfStudent=services.findAll();
			theModel.addAttribute("list",listOfStudent);
			return "all_employee_view";
			
		}
	
	//select * from student
	@GetMapping("/view-all")
	public String viewAll(Model m) {
		List<Student> listOfStudent=services.findAll();
        m.addAttribute("list",listOfStudent);
		return "all_employee_view";
	}
	
	//delete student from database
	@GetMapping("/delete")
	public String delete(HttpServletRequest request,Model m) {
		int id=Integer.parseInt(request.getParameter("id"));
		services.deleteStudent(id);
		List<Student> listOfStudent=services.findAll();
        m.addAttribute("list",listOfStudent);
		return "all_employee_view";
	}
	
	@GetMapping("/update")
	public String update(HttpServletRequest request,Model m) {
		int id=Integer.parseInt(request.getParameter("id"));
		List<Student> list=services.find(id);
		for(Student s:list) {
		m.addAttribute("student",s);
		}
		return "update_view";
	}
}
