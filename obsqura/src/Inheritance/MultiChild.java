package Inheritance;

public class MultiChild extends MultiParent 
{
public void mult()
{
	int a=10;
	int b=5;
	int c =a*b;
	System.out.println("The product is "+c);
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MultiChild obj = new MultiChild();
		obj.add();
		obj.sub();
		obj.mult();
		

	}

}
