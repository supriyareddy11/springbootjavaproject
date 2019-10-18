package xv.training.springbootkalyan1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.springbootkalyan1.entities.Student;
import xv.training.springbootkalyan1.repositories.StudentRepository;

@RestController
public class StudentControllers {
	
	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping("/students")
	public Iterable<Student> getStudents(){
		
		return studentRepository.findAll();
	}
	
}
