package Exception;

public class throw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a;
		try
		{
			for(a=1;a<=5;a++)
			{
				if (a==3)
					throw new ArithmeticException("We cant use a value as 3");
				System.out.println(a);
			}	
		
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	
	}

}
