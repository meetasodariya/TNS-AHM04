package Inheritance_Demo;
import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Salary in $: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter Worked ours per Day: ");
		int hoursWorked = sc.nextInt();
		
		Employee emp = new Employee(salary,hoursWorked);
		emp.setSalary(salary);
		emp.setHoursWorked(hoursWorked);
		
		System.out.println(emp.toString());
		emp.calculateFinalSalary();
		
		sc.close();
		
	}

}
