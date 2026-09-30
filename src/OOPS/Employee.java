/*Task 2: Parameterized Constructor
Problem: Employee Payroll System
Create a class named Employee with the following instance variables:
empId
empName
department
salary
Requirements
Create a parameterized constructor to initialize all values.
Create a display() method.
Create three employee objects with different data.
Display all employee details.
Sample Data
Employee ID
Name
Department
Salary
101
Ravi
HR
35000
102
Priya
Developer
55000
103
Kiran
Testing
42000
*/


package OOPS;

public class Employee {
	int empId;
	String empName;
	String department;
	double salary;
 public Employee(int EempId,String EempName,String Edepartment,double Esalary) {
	 empId=EempId;
	 empName=EempName;
	 department=Edepartment;
	 salary=Esalary;
	 
 }
 public Employee(Employee E1) {
	 empId=E1.empId;
	 empName=E1.empName;
	 department=E1.department;
	 salary=E1.salary;
 }
 public void display() {
     System.out.println("Employee ID : " + empId);
     System.out.println("Name        : " + empName);
     System.out.println("Department  : " + department);
     System.out.println("Salary      : " + salary);
     System.out.println();
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee(101, "Ravi", "HR", 35000);
        Employee E2 = new Employee(102, "Priya", "Developer", 55000);
        Employee E3 = new Employee(103, "Kiran", "Testing", 42000);
        E1.display();
        E2.display();
        E3.display();
	}

}
