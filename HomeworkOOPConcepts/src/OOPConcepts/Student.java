package OOPConcepts;
import java.util.Scanner;

public class Student extends Person implements PersonInterface{
	int stud_id;
	int grade_number;
	String fav_subject;
	boolean passing;
	
	
	
	
	Student(int id, String name, int age, String gender, boolean alive, int grade, boolean passing, String fave)
	{
		
		super(name,age,gender,alive);
		this.stud_id=id;
		this.grade_number=grade;
		this.fav_subject=fave;
		this.passing=passing;	
	}	
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter your name:");
			String name= sc.nextLine();
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			System.out.println("Are you Alive?");
			boolean alive=sc.nextBoolean();
			System.out.println("what is your id");
			int id=sc.nextInt();
			System.out.println("What grade are you in?");
			int grade=sc.nextInt();
			sc.nextLine();
			System.out.println("What is your favorite subject?");
			String fave=sc.nextLine();
			
			System.out.println("Your name is "+name+id+" and you are "+age+" years old and in grade "+grade+". Your favorite subject is "+fave+".  It is "+alive+" that you are alive!" );
			sc.close();
		}
}
