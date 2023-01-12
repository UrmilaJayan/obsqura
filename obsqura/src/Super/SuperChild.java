package Super;

public class SuperChild extends SuperParent 
{
	public void print() 
	{
		System.out.println("Child class method");
		super.add();
		System.out.println(super.a);
		System.out.println(super.b);
	}
public SuperChild()
{
	super();
	System.out.println("Child class constructor");
}
	public static void main(String[] args)
	{
		SuperChild obj = new SuperChild();
		obj.print();
		

	}

}
