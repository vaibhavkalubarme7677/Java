package Array;

public class MultiDimentionalArrayClass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        System.out.println("Output: ");
	        
			int a[][] = {{2,4,2},{4,3,6},{3,4,2},{8,6,9},{7,8,5}};
			
			for (int i=0; i<5;i++) 
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(" "+a[i][j]);
				}
				System.out.println();
			}
			
		}

	}
