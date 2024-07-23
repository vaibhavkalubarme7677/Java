package Exception;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			for(int i=0; i<=5;i++)
			{
				int a=8/i;
				System.out.println(a);
			}
			
		}
		catch  (Exception e)
		{
			System.out.println(e);
		}
	
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Out of block");
	
	}

}
