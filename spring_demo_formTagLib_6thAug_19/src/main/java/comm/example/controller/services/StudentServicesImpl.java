package comm.example.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import comm.example.controller.Student;
import comm.example.controller.dao.StudentDao;
import comm.example.controller.dao.StudentDaoImpl;

@Component
public class StudentServicesImpl implements StudentServices {

	@Autowired
	StudentDaoImpl dao;
	
	
	public String addStudent(Student s) {
		
		String msg=dao.addStudent(s);
		return msg;
	}

	public void editStudent(Student stdnt, int stId) {
		dao.editStudent(stdnt, stId);
	}

	public void deleteStudent(int stId) {
		dao.deleteStudent(stId);
		
	}

	public List <Student> find(int stId) {
		List <Student> st=dao.find(stId);
		return st;
	}

	public List<Student> findAll() {
		List<Student> lsitOfStudent=dao.findAll();
		return lsitOfStudent;
	}

	
}
