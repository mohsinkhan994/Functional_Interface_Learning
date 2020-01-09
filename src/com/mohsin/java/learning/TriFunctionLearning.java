package com.mohsin.java.learning;

import java.util.ArrayList;
import java.util.List;

import com.mohsin.model.Employee;

import com.mohin.learning.TriFunction;;

public class TriFunctionLearning {

	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(new Employee(21,"Abhinav",10000));
		empList.add(new Employee(25,"Mohsin",50000));
		
		empList.add(new Employee(15,"Vaibhav",70000));
		empList.add(new Employee(35,"Baba",1000));
		
		int ageLimit=18;
		
		
		TriFunction<Employee,Integer,Double,String> validEmployee=(employee,age,salary)->{
			
			if(employee!=null)
			{
				if(age>=ageLimit && salary>10000)
				{
					return employee.getName();
				}
			}
			return employee.getName()+" not eligible employee";
			
			
		};
		
		for(Employee emp:empList)
		{
			System.out.println(validEmployee.apply(emp, emp.getAge(), emp.getSalary()));
			
		}

	}

}
