package exception;

public class ArithmeticExceptionEx {
	public void div()
	{
		int a=10;
		try
		{
		int b=a/0;
		System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		ArithmeticExceptionEx obj = new ArithmeticExceptionEx();
		obj.div();
		System.out.println("lines after exception");

	}

}
