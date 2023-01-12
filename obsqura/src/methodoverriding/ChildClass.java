package methodoverriding;

public class ChildClass extends ParentClass 
{
	@Override
	public void display()
	{
		System.out.println("Child Class");
		super.display();
	}


	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass();
		obj.display();
		
	}

}
