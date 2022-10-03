package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeMapByName {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1,"ram","comp"));
		empList.add(new Employee(2,"jay","math"));
	    empList.add(new Employee(3,"ram","english"));
	    empList.add(new Employee(4,"ram","sci"));
	    
	    Map<String,List<Employee>> nameMap=new HashMap<>();
	    
	    for(Employee emp:empList) {
	    	if(nameMap.containsKey(emp.name))
	    	{
	    		List<Employee> list=nameMap.get(emp.name);
	    		list.add(emp);
	    		
	    	}else {
	    		List<Employee> list=new ArrayList<>();
	    		list.add(emp);
	    		nameMap.put(emp.getName(),list);
	    	}
	    }
	    Set<String> s=nameMap.keySet();
	    
	    for(String name:s) {
	    	System.out.println("name "+name+" "+nameMap.get(name));
	    }

	}

}
