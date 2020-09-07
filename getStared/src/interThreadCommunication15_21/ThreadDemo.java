package interThreadCommunication15_21;

public class ThreadDemo
{
	public static void main(String[] args)
	{
		
       
		Runnable r1=new Runnable1();
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=new Runnable2();
		Thread t2=new Thread(r2);
		t2.start();
		
	}

}

class  Runnable1 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class  Runnable2 implements Runnable
{

	@Override
	public void run() 
	{
		for(char i='a';i<'g';i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
