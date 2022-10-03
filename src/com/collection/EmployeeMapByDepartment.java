package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeMapByDepartment {

	public static void main(String[] args) {
		
      List<Employee> empList=new ArrayList<>();
      empList.add(new Employee(1,"ram","computer"));
      empList.add(new Employee(2,"jay","math"));
      empList.add(new Employee(3,"om","computer"));
      empList.add(new Employee(4,"sai","math"));
      
     
      
      
      Map<String,List<Employee>> departmentMap=new HashMap<>();
      for(Employee emp:empList) {
    	  if(departmentMap.containsKey(emp.department)) {
    		  List<Employee> list = departmentMap.get(emp.department);
    		  list.add(emp);
    	  }else {
    		  List<Employee> list = new ArrayList<>();
    		  list.add(emp);
    		  departmentMap.put(emp.getDepartment(), list);
    	  }
    	  
      }
      
     Set<String> s=departmentMap.keySet();
      for(String department:s) {
    	  System.out.println("Department:"+department+" "+departmentMap.get(department));
      }
    
     
	}

}
