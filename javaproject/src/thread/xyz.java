package thread;

public class xyz extends Thread{
	
	public void run()
	{
		try {
		for(int x=0;x<=5;x++)
		{
			System.out.println("x="+x);
			
				Thread.sleep(2000);
				if(x==3)
					throw new Exception("x is 3");
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
