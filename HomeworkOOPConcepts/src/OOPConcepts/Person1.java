package OOPConcepts;

import java.util.Scanner;

public class Person1 {
	private String pname;
	private int page;
	private String pgender;
	private boolean palive;
	private int pid;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPgender() {
		return pgender;
	}
	public void setPgender(String pgender) {
		this.pgender = pgender;
	}
	public boolean isPalive() {
		return palive;
	}
	public void setPalive(boolean palive) {
		this.palive = palive;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter your name:");
			String pname= sc.nextLine();
			System.out.println("Enter your age: ");
			int page=sc.nextInt();
			System.out.println("Are you Alive?");
			boolean palive=sc.nextBoolean();
			
			
			System.out.println("Your name is "+pname+" and you are "+page+" years old. It is "+palive+" that you are alive!" );
			sc.close();
		}
	
	
	
}
