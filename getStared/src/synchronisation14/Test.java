package synchronisation14;

public class Test 
{

	public static void main(String[] args) {
		
	
		Account a=new Account();
		new DepositeThread(a, 1000);
		new DepositeThread(a, 2000);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bal="+a.bal+"rs");

	}
}
