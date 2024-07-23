package java1;

public class NestedForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1;i<=5;i++)//2
		{
			for (int j=1;j<=i;j++)//1<=2  2<=2
				
			{
				System.out.println("*");//*
			}
			System.out.println();
		}
	}

}
