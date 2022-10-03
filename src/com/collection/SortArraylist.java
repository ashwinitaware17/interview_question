package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArraylist {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(6);
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.sort(list);
		System.out.println(list);

	}

}
