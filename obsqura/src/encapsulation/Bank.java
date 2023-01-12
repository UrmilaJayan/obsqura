package encapsulation;
public class Bank 
{
	private int pin;
	private boolean flag=false;
	private int balance=10000;
	
	public void setter(int pin)
	{
		this.pin=pin;
	}
	public void getter()
	{
		if(pin==1001||pin==1234||pin==1212)
		{
			flag=true;
			System.out.println("Pin is valid");
		}
	
	if(flag==true)
	{
		 int widrw = 2000;
		if(widrw<=balance)
		{
		System.out.println("Withdrawal is possible.");	
		balance =balance - widrw;
		System.out.println("Balance after transaction is "+balance);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		}
	else
	{
		System.out.println("Invalid pin.Transaction is not possible.");
	}

}
}
