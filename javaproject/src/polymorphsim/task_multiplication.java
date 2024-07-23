package polymorphsim;

public class task_multiplication extends task_subtraction{
	
	void mul(int a,int b) {
		System.out.println("Multiplication Result = "+(a*b));
	}
	void mul(int a,int b,int c) {
		System.out.println("Multiplication Result = "+(a*b*c));
	}
	void mul(int a,int b,int c,int d) {
		System.out.println("Multiplication Result = "+(a*b*c*d));
	}

}
