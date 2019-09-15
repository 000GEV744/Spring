package com.example.springInheritanceEmployeedemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springInheritanceEmployeedemo.entity.ContractualEmployee;
import com.example.springInheritanceEmployeedemo.entity.Employee;
import com.example.springInheritanceEmployeedemo.repository.ContractualEmployeeRepository;
import com.example.springInheritanceEmployeedemo.repository.EmployeeRepository;
import com.example.springInheritanceEmployeedemo.repository.RegularEmployeeRepository;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	private EmployeeRepository empRepo;
	private ContractualEmployeeRepository contractEmpRepo;
	private RegularEmployeeRepository regEmpRepo;
	
	

	public EmployeeController(EmployeeRepository empRepo, ContractualEmployeeRepository contractEmpRepo,
			RegularEmployeeRepository regEmpRepo) {
		super();
		this.empRepo = empRepo;
		this.contractEmpRepo = contractEmpRepo;
		this.regEmpRepo = regEmpRepo;
	}


	@GetMapping("/list")
	public String getAllEmployee(Model m) {
		
		List<Employee> employee = empRepo.findAll();
		List<ContractualEmployee> conEmp = contractEmpRepo.findAll();
		m.addAttribute("Contract", conEmp);
		m.addAttribute("Employee", employee);
		return "employee/list-employee";
	}

}
