package Array;

public class jaggedarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Output: ");
		
		int a[][]=new int[5][];
		a[0]= new int[3];
		a[1]= new int [4];
		a[2]= new int [5];
		a[3]= new int [6];
		a[4]= new int [7];
		
		//initialise
		int count =0;
		for(int i=0;i<a.length;i++)
		{	for (int j=0;j<a[i].length;j++)
			{
				a[i][j]=count++;
			}
		}
		//print
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
	}

}
