package com.mohsin.java.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.mohsin.model.Employee;

public class FunctionInterfaceLearning {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(21,"Abhinav",10000));
		empList.add(new Employee(25,"Mohsin",50000));
		
		empList.add(new Employee(15,"Vaibhav",70000));
		empList.add(new Employee(35,"Baba",1000));
		
		
		Function<Employee,String> validemployeeName= (Employee e)->{
		
			
				return e.getName();
			
		};
		
		
		for(Employee emp:empList)
		{
			System.out.println(validemployeeName.apply(emp));
		}

	}

}
