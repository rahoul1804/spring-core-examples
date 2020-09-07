package synchronisation14;

public class DepositeThread implements Runnable
{
 Account a;
 double amt;
 public DepositeThread(Account a,double amt) 
 {
	 this.a=a;
	 this.amt=amt;
	 new Thread(this).start();
}
	
	@Override
	public void run() 
	{
		a.deposite(amt);
		System.out.println(amt +"rs deposited");
		
	}

}