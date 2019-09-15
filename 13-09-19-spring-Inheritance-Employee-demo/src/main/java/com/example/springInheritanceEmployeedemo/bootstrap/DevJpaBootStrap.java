package com.example.springInheritanceEmployeedemo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springInheritanceEmployeedemo.entity.ContractualEmployee;
import com.example.springInheritanceEmployeedemo.entity.Employee;
import com.example.springInheritanceEmployeedemo.entity.RegularEmployee;
import com.example.springInheritanceEmployeedemo.repository.ContractualEmployeeRepository;
import com.example.springInheritanceEmployeedemo.repository.EmployeeRepository;
import com.example.springInheritanceEmployeedemo.repository.RegularEmployeeRepository;


@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent>{

	private EmployeeRepository empRepo;
	private ContractualEmployeeRepository conEmpRepo;
	private RegularEmployeeRepository regEmpRepo;
	
	
	public DevJpaBootStrap(EmployeeRepository empRepo, ContractualEmployeeRepository conEmpRepo,
			RegularEmployeeRepository regEmpRepo) {
		super();
		this.empRepo = empRepo;
		this.conEmpRepo = conEmpRepo;
		this.regEmpRepo = regEmpRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
	}
	
	private void init() {
		
		Employee anuj = new Employee();
		anuj.setFirstName("Anuj");
		anuj.setLastName("Singh");
		anuj.setEmail("anuj3@gg.com");
		empRepo.save(anuj);
		
		//saving one contractual Employee
		ContractualEmployee conEmp = new ContractualEmployee("ambi2@gg.com", "Ambikesh", "Gupta", 5, 12000);
		conEmpRepo.save(conEmp);
		
		RegularEmployee regEmp = new RegularEmployee("shivam@gg.com", "shivam", "Gupta", 1200, 50000);
		regEmpRepo.save(regEmp);
		
	}
}