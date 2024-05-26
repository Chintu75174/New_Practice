package com.streams.practice;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
	//1 . How many males and female employee are there in the organization
		
		//Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.counting()));
		//System.out.println(collect);
		
	//2. Print the name of the all department in the organization

		//	employeeList.stream().map(e->e.Department).distinct().forEach(System.out::println);
		
	//3.	What is average age of male and female
		
		//Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy((e->e.gender),Collectors.averagingDouble(e->e.age)));
		//System.out.println(collect);
		
	//4. Get the details of the highest paid employee in the organization
		
		//Optional<Employee> collect = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		//System.out.println(collect.get());
		
	//5. Get the names of all employee who have joined after 2015
		
		//	employeeList.stream().filter(e->e.yearOfJoining>2015).forEach(System.out::println);
		
	//6. Count the number of Employee in each Department
		
		//Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy((e->e.department),Collectors.counting()));
		//System.out.println(collect);
		
	//7. Get the Details of the Youngest male employee in Developement Department
		
		//Optional<Employee> collect = employeeList.stream().filter(e->e.department.equals("Development"))
		//								.collect(Collectors.minBy(Comparator.comparing(e->e.age)));
		//System.out.println(collect.get());
	
	//8. Average Salary in each department
		
		//Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy((e->e.department),Collectors.averagingDouble(e->e.salary)));
		//System.out.println(collect);
		
	//9. Who has the most working experience
		
		//Optional<Employee> collect = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(e->e.yearOfJoining)));
		//System.out.println(collect);

	//10. How many male and female in Sales team
		
		//Map<String, Long> collect = employeeList.stream().filter(e->e.department.equals("Sales"))
		//						.collect(Collectors.groupingBy(e->e.gender,Collectors.counting()));
		//System.out.println(collect);

	
		
	}

}
