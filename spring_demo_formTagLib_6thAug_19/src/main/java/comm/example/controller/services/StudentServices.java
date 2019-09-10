package comm.example.controller.services;
import java.util.List;

import org.springframework.stereotype.Component;

import comm.example.controller.Student;

@Component
public interface StudentServices {

	public String addStudent(Student s);
    public void editStudent(Student emp, int stId);
    public void deleteStudent(int stId);
    public List <Student> find(int stId);
    public List <Student> findAll();
}
