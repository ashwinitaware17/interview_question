package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorByMarks {

	public static void main(String[] args) {
		
		List<StudentData1> studList=new ArrayList<>();
        studList.add(new StudentData1(1,"vikas",80));
        studList.add((new StudentData1(2,"sachin",60)));
        studList.add(new StudentData1(3,"ashwini",70));
        
        Collections.sort(studList,new MarksComparator());
        
        for(StudentData1 stud:studList) {
        	System.out.println(stud);
        }
        
	}

}
