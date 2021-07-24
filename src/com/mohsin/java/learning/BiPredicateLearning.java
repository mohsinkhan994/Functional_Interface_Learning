package com.mohsin.java.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

import com.mohsin.model.Employee;

public class BiPredicateLearning {

	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(new Employee(21,"Abhinav",10000));
		empList.add(new Employee(25,"Mohsin",50000));
		
		empList.add(new Employee(15,"Vaibhav",70000));
		empList.add(new Employee(35,"Baba",1000));
		
		int ageLimit=18;
     
		
		
		BiPredicate<Employee,Integer> isEmployeeValid= (employee,age)->{
			if(employee!=null)
			{
				if(age>=ageLimit) {
					
					return true;
				}
			}
			return false;
		};
		
		
		for(Employee emp: empList)
			 if(isEmployeeValid.test(emp, emp.getAge())) {
				 System.out.println(emp.getName() +" employee is valid");
			 }
	}

}
	