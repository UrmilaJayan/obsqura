package access2;

import access1.class1;

public class class3 extends class1
{
	public static void main (String args[])
	{
		class3 obj2 =new class3();
		//obj2.prvtMthd();
		obj2.prtcMethod();//access outside package with extends keyword
		obj2.publicMethod();
		//obj2.dfltMthd();//no access outside package
	}


}
