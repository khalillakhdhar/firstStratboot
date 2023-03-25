package com.demo.model;

public class Etudiant extends User {
private String niveau;

public Etudiant(String nom, String prenom, String niveau) {
	super(nom, prenom);
	this.niveau = niveau;
}

@Override
public String toString() {
	return "Etudiant [niveau=" + niveau + ", toString()=" + super.toString() + "]";
}




}
