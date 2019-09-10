package comm.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class FormController {

	static List<Employee> list= new ArrayList<Employee>();
	@RequestMapping(method = RequestMethod.GET, name="/getForm")
	public String display() {
		return "form";
	}
	@RequestMapping(method = RequestMethod.POST, name="/processForm")
	public String displayProcess(HttpServletRequest request,@RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName,@RequestParam("email") String email, Model m) {
		HttpSession session = request.getSession();
		
		FormController.list.add(new Employee(firstName,lastName,email));
		session.setAttribute("Employees", list);
		return "fromview";
	}
}
