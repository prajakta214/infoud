package com.infoud.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee employee1 =new Employee("Emp1", "Prajakta", 21, "Female", 20000.54);
		
		Employee employee2 =new Employee("Emp2", "Raveena", 23, "Female", 19050.54);
		
		Employee employee3 =new Employee("Emp3", "Rushin", 20, "Male", 21000.00);
		
		Employee employee4 =new Employee("Emp4", "Harsh", 23, "Male", 19000.54);
		
		
		List<Employee> list1=new ArrayList<Employee>();
		
		list1.add(employee1);
		list1.add(employee2);
		list1.add(employee3);
		list1.add(employee4);
		//System.out.println(list1);

		
		System.out.println("List of employee names:");
		for(Employee e:list1){
			System.out.println(e.getEmpName());
		}
	
		System.out.println("Sort list using salary:");
		Collections.sort(list1, new EmpSalaryCompare());
        for(Employee e: list1)
       {
    	   System.out.println(e);
       }
		
        System.out.println();
		System.out.println("Sort list using Age:");
        Collections.sort(list1, new EmpAgeCompare());
		for(Employee e: list1)
	       {
	    	   System.out.println(e);
	       }
		
		System.out.println();
		System.out.println("Sort based on salary using treeset");
		Set<Employee> set1 = new TreeSet<Employee>(new EmpSalaryCompare());
		set1.addAll(list1);
		System.out.println(set1);
		
		System.out.println();
		System.out.println("Sort based on age using treeset");
		Set<Employee> set2 = new TreeSet<Employee>(new EmpAgeCompare());
		set2.addAll(list1);
		System.out.println(set2);
		
		System.out.println();
		Set<Integer> set3 = new HashSet<Integer>();
        System.out.println("List of employee's unique ages:");
		for(Employee e:list1){
			set3.add(e.getAge());
		}
		System.out.println(set3);
		
		
		Employee employee=new Employee();
		
       employee.print(employee.groupByGender(list1));
		
		
	}

}
