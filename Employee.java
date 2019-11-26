package com.infoud.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public class Employee {
	private String empId;
	private String empName;
	private int age;
	private String gender;
	private double salary;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String empId, String empName, int age, String gender,
			double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age="
				+ age + ", gender=" + gender + ", salary=" + salary + "]";
	}

	/*public void print() {

		System.out.println("Employee ID: " +empId+ "\n Employee Name: "+empName+ "\n Employee Age: "+age+ 
				"\n Employee Gender: " +gender+ "\n Employee Salary: "+salary);
		
	}
*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		// it checks if the argument is of the
		// type Geek by comparing the classes
		// of the passed argument and this object.
		// if(!(obj instanceof Geek)) return false; ---> avoid.
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		// type casting of the argument.
		Employee emp = (Employee) obj;

		// comparing the state of argument with
		// the state of 'this' Object.
		return (emp.gender == this.gender);
	}

	@Override
	public int hashCode() {
		return (Objects.hash(gender));
	}

	
	
	
	public Employee() {
		super();
	}

	public Map<String, List<Employee>> groupByGender(List<Employee> emplist) {
		Map<String, List<Employee>> map = new HashMap<String, List<Employee>>();
		for (Employee p : emplist) {
			if (!map.containsKey(p.getGender())) {
				map.put(p.getGender(), new ArrayList<Employee>());
			}
			map.get(p.getGender()).add(p);
		}
		return map;
	}


	public void print(Map<String, List<Employee>> map) {

		Set<Entry<String, List<Employee>>> entrySet = map.entrySet();

		for (Entry<String, List<Employee>> entry : entrySet) {

			System.out.println(entry.getKey() + " Employees : ");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e);
			}
		}
	}
	

}
