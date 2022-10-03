package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElementsFromArrayList {

	public static void main(String[] args) {
		
       List<String> list=new ArrayList<>();
       
       list.add("apple");
       list.add("mango");
       list.add("pineapple");
       list.add("mango");
       list.add("apple");
       
       System.out.println("original list : "+list);
       
       Set<String> set=new HashSet<>();
       set.addAll(list);
       System.out.println("after removing duplicate element : "+set);
       
	}

}
