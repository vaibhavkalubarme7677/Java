package thread;

public class class1 extends Thread{
	
	public void run ()
	{
		try
		{
		for (int i=1;i<=5;i++)
		{
			System.out.println("Vaibhav");
			Thread.sleep(3000);
		}
	 } catch (InterruptedException e)
		{
		 e.printStackTrace();
		}
		
 }
}

	


