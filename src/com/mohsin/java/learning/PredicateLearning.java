package com.mohsin.java.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.mohsin.model.Employee;

public class PredicateLearning {
	
	public static Predicate<String> hasLength5= new Predicate<String>() {
		@Override
		public boolean test(String t) { 
			
			return t.length()>5;
		}
	};
	public static void predicate_or(String a) {
		Predicate<String> checkName=p->p.contains("M");
		
		  boolean outcome = hasLength5.or(checkName).test(a);
		  System.out.println("employee name is valid"+ outcome);
		
	}

	
	public static void main(String[] args) {
	Predicate<Integer> lesserThan= i-> (i<18);
	
	
	System.out.println(lesserThan.test(20));
	
	
	
	Predicate<Integer> greaterThan= i->(i>18);
	
	//greaterThan.
	System.out.println(greaterThan.test(21) );
	
	
	Employee emp=new Employee();
	emp.setName("Mohsin");
	emp.setAge(25);
	predicate_or(emp.getName());
	Predicate<Integer> checkAge=i->(i>20);
	
	//hasLength5.or(other)
	
	//predicate chaining
	if(checkAge.and(greaterThan).test(emp.getAge()))
			{
		System.out.println(emp.getName()+" "+" is eligible employee");
			}
	else
	{
		System.out.println(emp.getName()+" "+ "is under Age employee");
	}
	
	
	
		List<Employee> empList= new ArrayList<Employee>();
			empList.add(new Employee(21,"abhinav", 10000));
			empList.add(new Employee(15,"baba",500));
			empList.add(new Employee(25,"Mohsin", 50000));
			empList.add(new Employee(12,"qwerty", 20000));
			empList.add(new Employee(29,"sdfgh", 30000));
			
			
			List<Employee> validEmployees=process(empList, (Employee e)-> e.getAge()>20);
			
			System.out.println(validEmployees.toString());

	}
	
	public static List<Employee> process(List<Employee> employees, Predicate<Employee> predicat)
	{
		List<Employee> result= new ArrayList<Employee>();
		 for (Employee emp: employees)         
	            if (predicat.test(emp))             
	                result.add(emp); 
	        return result; 
	}
	
	
}
