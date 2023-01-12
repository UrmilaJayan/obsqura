package review;

public class classclass2 extends classclass1 {
	public void add()
	{
	int a =50;
	int b =20;
	int c =a-b;
	System.out.println("The diff is "+c);
	super.add();
	}

	public static void main(String[] args)
	{
		classclass2 obj = new classclass2();
		obj.add();
				

	}

}
