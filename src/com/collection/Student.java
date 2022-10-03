package com.collection;

public class Student implements Comparable<Student> {

	int id;
	String name;
	int marks;
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
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student s) {
		if(marks==s.marks)
			return 0;
		else if(marks<=s.marks) 
			return 1;
		else
		return -1;
	}
	
	
	
}
