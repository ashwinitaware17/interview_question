package com.collection;

import java.util.Comparator;

public class StudentData1 {

	int id;
	String name;
	int marks;
	
	
	public StudentData1(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks=marks;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	


	@Override
	public String toString() {
		return "StudentData1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}


	

}
