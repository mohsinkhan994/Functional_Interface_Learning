package com.mohsin.java.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import com.mohsin.model.Employee;

public class BiFunctionLearning {

	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(new Employee(21,"Abhinav",10000));
		empList.add(new Employee(25,"Mohsin",50000));
		
		empList.add(new Employee(15,"Vaibhav",70000));
		empList.add(new Employee(35,"Baba",1000));
		
		int ageLimit=18;
		
		BiFunction<Employee,Integer,String> validEmployee=(emp,age)->{
			
			if(emp!=null)
			{
				if(age>=ageLimit)
				{
					return emp.getName();
				}
			}
			return   emp.getName()+"  not eligible";
			
			
		};
		for(Employee empL:empList)
		{
			System.out.println(validEmployee.apply(empL, empL.getAge()));
			
				
			}
		}

	}


