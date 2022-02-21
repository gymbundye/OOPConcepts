package OOPConcepts;

public class Person implements PersonInterface {
	
	String pname;
	int page;
	String pgender;
	boolean palive;
	
	
	public Person()
	{
		
	}
	
	public Person(String name, int age, String gender, boolean alive )
	{
		pname=name;
		page=age;
		pgender=gender;
		palive=alive;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
