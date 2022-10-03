package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {

	public static void main(String[] args) {
		
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student(1,"bob",80));
		studentList.add(new Student(2,"john",50));
		studentList.add(new Student(3,"johny",60));
		
		Collections.sort(studentList);
		for(Student s:studentList) {
			System.out.println("id : "+s.getId()+" name : "+s.getName()+" marks : "+s.getMarks());
		}
		

	}

}
