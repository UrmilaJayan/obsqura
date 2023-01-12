package interfaceEx;

public class Sample2 implements Sample1  
{

	@Override
	public void print() {
		
		System.out.println("Interface Method");	
	}

	@Override
	public void add() {
		
		System.out.println("sum is "+(a+b));
	}
	public void display()
	{
		System.out.println("child Method");	
	}
	public static void main(String args[])
	{
		Sample2 obj = new Sample2();
		obj.add();
		obj.display();
		obj.print();
	}
}
