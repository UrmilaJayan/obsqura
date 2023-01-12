package Inheritance;

public class SingleChild extends SingleParent
{
	public void add()
{
	int c =a+b;
	System.out.println("sum "+c);
	
}
public void print()
{
	System.out.println("Child class method");
}
public static void main(String args[])
{
	SingleChild obj = new SingleChild();
	obj.display();
	obj.add();
	obj.print();
	
}
}