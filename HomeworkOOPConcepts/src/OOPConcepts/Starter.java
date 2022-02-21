package OOPConcepts;
import java.util.*;
public class Starter implements PersonInterface {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	    String pname=null;
		int page=0;
	    String pgender=null;
		boolean palive=true ;
		int pid=0;
		
		try {
			System.out.println("Enter name: ");
			pname=sc.nextLine();
			System.out.println("Enter ID Number");
			pid=sc.nextInt();
			System.out.println("Enter age: ");
			page=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Gender: ");
			pgender=sc.nextLine();
			System.out.println("Are you alive?  ");
			palive=sc.nextBoolean();
			sc.close();
			
		}
		catch(Exception e) {
			System.out.println("!Wrong Data Type Entered!");
		}
		Person1 p=new Person1();
		p.setPname(pname);
		p.setPage(page);
		p.setPgender(pgender);
		p.setPalive(palive);
		p.setPid(pid);
		
		System.out.println("Person "+p.getPid());
		System.out.println("Name: "+p.getPname());
		System.out.println("Age: " +p.getPage());
		System.out.println("Gender: "+p.getPgender());
		System.out.println("Alive: "+p.isPalive());
		
		}

	@Override
	public double calculate(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compute(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}
		
	}


