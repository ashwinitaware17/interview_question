package com.collection;

import java.util.Comparator;

public class MarksComparator implements Comparator<StudentData1>{
	@Override
	public int compare(StudentData1 s1, StudentData1 s2) {
		
		if(s1.marks==s2.marks)
			return 0;
		else if(s1.marks>s2.marks)
			return 1;
		else
			return -1;
			
		
	}
}
