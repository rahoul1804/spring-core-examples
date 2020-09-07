package exception1;

public class Account 
{
	static int balance=5000;
	public static void withDraw(int ammount) throws LessBalanceExcetion
	{
		if(ammount>balance)
		{
			throw new LessBalanceExcetion();
		}
		else
		{
			System.out.println("amount withdrawn , plz collect ur money");
		}
		
	}
	

	public static void main(String[] args) 
	{
		
		try {
			withDraw(7000);
		}
		catch (LessBalanceExcetion e) 
		{
			e.printStackTrace();
			System.out.println("Exception occured:plz enter valid amount");
		}
		
	}

}
