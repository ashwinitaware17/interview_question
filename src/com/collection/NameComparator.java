package com.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Teacher>{

	@Override
	public int compare(Teacher t1, Teacher t2) {
		
		return t1.name.compareTo(t2.name);
	}

}
