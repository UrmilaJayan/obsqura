package access1;

public class class1 
{
	public void publicMethod()
	
	{
		System.out.println("public method");
	}
	void dfltMthd()
	{
		System.out.println("Dflt method");
	}
	private void prvtMthd() 
	{
		System.out.println("prvt method");
	}
	protected void prtcMethod() 
	{
		System.out.println("prtcted method");
	}
	public static void main (String args[])
	{
		class1 obj1 =new class1();
		obj1.prvtMthd();
		obj1.prtcMethod();
		obj1.publicMethod();
		obj1.dfltMthd();
	}

}
