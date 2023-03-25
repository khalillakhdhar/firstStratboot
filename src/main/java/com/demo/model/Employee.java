package com.demo.model;

public class Employee extends User {
private String domaine;

public Employee(String nom, String prenom, String domaine) {
	super(nom, prenom);
	this.domaine = domaine;
}

@Override
public String toString() {
	return "Employee [domaine=" + domaine + ", toString()=" + super.toString() + "]";
}





}
