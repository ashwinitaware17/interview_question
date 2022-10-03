package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseArraylist {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(9);
		list.add(3);
		list.add(5);

		System.out.println("original arraylist element : " + list);

		Collections.reverse(list);

		System.out.println("reverse arraylist element : " + list);

	}

}
