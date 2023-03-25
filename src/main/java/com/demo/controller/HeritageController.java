package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.model.Etudiant;

@RestController
public class HeritageController {

	@GetMapping("employee")
	public String getEmployee()
	{
		Employee employee=new Employee("khalil", "Lakhdhar", "Informatique");
		return employee.toString();
	}
	@GetMapping("student")
	public String getEtudiant()
	{
		Etudiant et=new Etudiant("student", "student", "bac");
		return et.toString();
	}
	
}
