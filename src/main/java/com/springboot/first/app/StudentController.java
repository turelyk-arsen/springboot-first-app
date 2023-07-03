package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/student")
    public Student getStudent() {
    	return new Student("Arsen","Turelyk");
    }
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Arsen", "Turelyk"));
		students.add(new Student("Tony", "Cena"));
		students.add(new Student("Sanjay", "Jadhav"));
		students.add(new Student("Ram", "Turelyk"));
		students.add(new Student("Umesh", "Turelyk"));
		return students;
	}
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, 
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
//	http://localhost:8080/student/query?firstName=arsen&lastName=turelyk
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam(name = "firstName") String firstName, 
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
}
