package synchronisation14;

public class Account 
{
	double bal=1000;
  synchronized	void deposite(double amt)
	{
		double currntBalance=bal;
		double newBalance=currntBalance+amt;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bal=newBalance;
	}
  
}
