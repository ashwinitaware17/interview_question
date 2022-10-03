package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertArraylistIntoMap {

	public static void main(String[] args) {
		
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee(1,"ashwini","HR"));
		employeeList.add(new Employee(2,"vikas","IT"));
		employeeList.add(new Employee(3,"keyansh","IT"));
		employeeList.add(new Employee(4,"suhas","HR"));
		
        Map<Integer,Employee> employeeMap=new HashMap<Integer,Employee>();
        
        for(Employee e:employeeList) {
        	
        	employeeMap.put(e.getId(), e);
        }
        
        Set<Integer> s=employeeMap.keySet();
        for(int key:s) {
        	
        	System.out.println("key : "+key+" "+employeeMap.get(key));
        }
        
      
	}

}
