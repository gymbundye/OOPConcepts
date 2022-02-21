package OOPConcepts;

import java.util.Scanner;

public class Employee extends Person {
	int emp_id;
	double emp_salary;
	String emp_dept;
	
	Employee(){
		
	}
	
	Employee(int id, String name, int age, String gender, double salary, boolean alive, String dept)
	{
		
		super(name, age, gender, alive);
		emp_id=id;
		emp_salary=salary;
		emp_dept=dept;
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter your name:");
			String name= sc.nextLine();
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			System.out.println("Are you Alive?");
			boolean alive=sc.nextBoolean();
			System.out.println("What is your id");
			int id=sc.nextInt();
			System.out.println("What is your salary?");
			double salary=sc.nextDouble();
			sc.nextLine();
			System.out.println("What is your Department?");
			String dept=sc.nextLine();
			
			System.out.println("Your name is "+name+" and you are "+age+" years old and work in the "+dept+" Department. Your Salary is "+salary+".  It is "+alive+" that you are currently alive!  Your ID number is "+id+"!" );
			sc.close();
		}


}
