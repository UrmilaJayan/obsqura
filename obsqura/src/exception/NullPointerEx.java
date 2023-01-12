package exception;

public class NullPointerEx {
	public void display()
	{
		
		try 
		{
			String s =null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) 
	{
		NullPointerEx obj = new NullPointerEx();
		System.out.println("before exception");
		obj.display();
		System.out.println("after exception");
	}

}
