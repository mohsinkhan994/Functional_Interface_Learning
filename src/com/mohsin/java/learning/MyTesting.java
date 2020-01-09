package com.mohsin.java.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mohin.learning.MyFirstInterface;
import com.mohsin.model.Employee;
import com.mohin.learning.MySimpleInterest;;

public class MyTesting {

	public static void main(String[] args) {
		MyFirstInterface m = (a,b) -> { 
										long dis = a - (a*b/100);
										return dis;
									  };
		
		System.out.println(m.discount(10L, 20L));
		
		
		
		
		
		
		Comparator<Integer> c = (x,y) -> {
			
				return x.compareTo(y);
		};
		
		System.out.println( c.compare(20,30));
		
		Comparator<String> s=(d,e) -> {
			return d.compareTo(e);
		};
		System.out.println(s.compare("Mohsin", "prachir"));
		
		List<Employee> employeeList = new ArrayList<>();
		for(int i = 100 ; i<=150; i++) {
			Employee emp = new Employee(i,i+"m",i*5);
			employeeList.add(emp);
		}
		
		System.out.println("Employee Orginial ---->"+employeeList.toString());
		Comparator<Employee> salaryComRever = (e1,e2) ->
													{
														return new Double(e2.getSalary()).compareTo(e1.getSalary());
														
													};
		Collections.sort(employeeList,salaryComRever.reversed() );
		
		System.out.println("Employee After Reversal ---->"+employeeList.toString());
		
		
		Comparator<Employee> salaryInIncreasingOrder= (emp1,emp2) ->
																{
																	
																	return new Double(emp1.getSalary()).compareTo(emp2.getSalary());
																};
	//	Collections.sort(employeeList,salaryInIncreasingOrder.reversed());
		System.out.println("Employee in increasing order ---->"+employeeList.toString());
		Employee emp2 = new Employee(120,"120m",600.00);
		System.out.println(Collections.binarySearch(employeeList, emp2));
		
		
		
		
		MySimpleInterest mk =(p,r) -> {
			long simpleinterest= (p*r)/100;
			return simpleinterest;
		};
		
		System.out.println(mk.simpleInterest(120L,10L));
	}
	
		

	
}
