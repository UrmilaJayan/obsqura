package Inheritance;

public class HierChild1 extends HierParent
{
	public void sub()
	{
		int a=50;
		int b=10;
		int c=a-b;
		System.out.println("The diff is "+c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HierChild1 obj1 = new HierChild1();
		obj1.add();
		obj1.sub();
		
		

	}

}
