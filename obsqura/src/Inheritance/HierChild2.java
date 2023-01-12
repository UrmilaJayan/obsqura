package Inheritance;

public class HierChild2 extends HierParent
{
	
public void mul()
{
	int a=50;
	int b=10;
	int c=a*b;
   System.out.println("Product is "+c);

}
public static void main(String args[])
{
	HierChild2 obj2 = new HierChild2();
	obj2.add();
	obj2.mul();
}
	
}
