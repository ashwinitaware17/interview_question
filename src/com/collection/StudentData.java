package com.collection;

public class StudentData implements Comparable<StudentData>{
    
	int id;
	String name;
	String address;
	public StudentData(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int compareTo(StudentData stud) {
		return this.name.compareTo(stud.name);
		
		
	}
	
	
}
