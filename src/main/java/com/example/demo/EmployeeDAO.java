package com.example.demo;
import com.example.demo.Employees;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	private static Employees list
    = new Employees();
	static
	{
	
	    list.getEmployeeList().add(
	        new Employee(
	            1,
	            "Prem",
	            "Tiwari",
	            "chapradreams@gmail.com"));
	
	    list.getEmployeeList().add(
	        new Employee(
	            2, "Vikash",
	            "Kumar",
	            "abc@gmail.com"));
	
	    list.getEmployeeList().add(
	        new Employee(
	            3, "Ritesh",
	            "Ojha",
	            "asdjf@gmail.com"));
	
	       
	}


	public Employees getAllEmployees()
	{
	
	    return list;
	}
	    public void
	    addEmployee(Employee employee)
	{
	    list.getEmployeeList()
	        .add(employee);
	       
	}

}
