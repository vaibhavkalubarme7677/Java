package task_operators;

public class Comparison_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//equal to:-
		int a=5;
		int b=7;
		
		boolean isEqual = (a==b);
		System.out.println(""+isEqual);//false
		
//not equal to:-
		int x= 10;
		int y= 10;
		
		boolean notEqualto =(x != y);
		System.out.println(""+notEqualto);//false
		
//greater than:-
		int m=20;
		int n=10;
		boolean isGreaterThan = (m>n);
		System.out.println(""+isGreaterThan);//true
		
//Less than:-
		int p=10;
		int q=20;
		boolean isLessThan = (p<q);
		System.out.println(""+isLessThan);//true
		

//greater than or equal to:-
		int num1=12;
		int num2=10;
		boolean GreaterOrEqual = (num1>=num2);
		System.out.println(""+GreaterOrEqual);//true
		
		
//Less than or equal to:-
		int val1=5;
		int val2=7;
		boolean LessOrEqual = (val1<=val2);
		System.out.println(""+LessOrEqual);	//true
			
		
	}

}
