package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceByName {

	public static void main(String[] args) {
		
		List<StudentData> list1=new ArrayList<>();
		list1.add(new StudentData(1,"ashwini","pune"));
		list1.add(new StudentData(2,"vikas","mumbai"));
		list1.add(new StudentData(3,"keyansh","hadpsar"));
		
		Collections.sort(list1);
		
		for(StudentData stud:list1) {
			System.out.println(stud);
		}
		
	}

}
