package thread;

public class abc extends Thread {
	
	public void run()
	{
		try
		{
			for(int a=0;a<=5;a++) 
			{
			System.out.println("a="+a);
			    Thread.sleep(3000);
			}
            } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
	
	


