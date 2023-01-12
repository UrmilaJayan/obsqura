package Super;

public class SuperParent 
{
	int a = 10;
	int b =20;
	public void add()
	{
		
		int c =a+b;
		System.out.println("The sum is "+c);
	}
	public SuperParent ()
	{
		System.out.println("Parent class constructor");
	}

}
