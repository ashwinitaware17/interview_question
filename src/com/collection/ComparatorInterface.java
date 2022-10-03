package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorInterface {

	public static void main(String[] args) {

		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(new Teacher(1, "rahul", 5));
		teacherList.add(new Teacher(2, "manoj", 8));
		teacherList.add(new Teacher(3, "papu", 7));

		Collections.sort(teacherList, new NameComparator());

		System.out.println(teacherList);
	}
}
