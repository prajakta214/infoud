package com.infoud.employee;

import java.util.Comparator;

public class EmpAgeCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getAge() > e2.getAge())
		
		return 1;
		
		else if (e1.getAge() < e2.getAge())
			return -1;
		else
			return 0;
	}

	
	

}
