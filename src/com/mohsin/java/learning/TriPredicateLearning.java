package com.mohsin.java.learning;

import java.util.ArrayList;
import java.util.List;

import com.mohsin.model.Employee;
import com.mohin.learning.TriPredicate;;

public class TriPredicateLearning {

	public static void main(String[] args) {
		
			List<Employee> empList= new ArrayList<Employee>();
			
			empList.add(new Employee(21,"Abhinav",10000));
			empList.add(new Employee(25,"Mohsin",50000));
			
			empList.add(new Employee(15,"Vaibhav",70000));
			empList.add(new Employee(35,"Baba",1000));
			int ageLimit=18;
			
			TriPredicate<Employee,Integer,String> validateEmployee=(employee,age,name)->{
				
				if(employee!=null)
				{
					if(age>=ageLimit && name.length()>5)
					{
						return true;
					}
				}
				return false;
			
			};
			
			for(Employee emp: empList)
			{
				if(validateEmployee.test(emp,emp.getAge(),emp.getName())) {
			System.out.println(emp.getName()+" "+"valid employee ");
			}
				else
				{
					System.out.println("invalid employee" + " " +emp.getName());
				}
			}

	}

}
