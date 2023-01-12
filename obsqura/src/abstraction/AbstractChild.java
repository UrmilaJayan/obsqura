package abstraction;

public class AbstractChild extends AbstractMain

{
	public void print()
	{
		System.out.println("Abstract Method");
	}
public static void main(String args[])	
{
	AbstractChild obj = new AbstractChild();
	obj.display();
	obj.print();
}

}
