package Inheritance_Demo;

public class Employee {
	
	private double salary;
	private int hoursWorked;
	
	public Employee(double salary, int hoursWorked) {
		super();
		this.salary = salary;
		this.hoursWorked = hoursWorked;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", hoursWorked=" + hoursWorked + "]";
	}
	
	public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

	 public void addWork() {
	        if (hoursWorked > 6) {
	            salary += 5;
	        }
	    }
	
	 public void calculateFinalSalary() {
	        addSal();
	        addWork();
	        System.out.println("Final Salary: $" + salary);
	    }
	
}
