package polymorphsim;

public class task_subtraction extends task_addition{

	void sub(int a,int b) {
		System.out.println("Subtraction Result = "+(a-b));
	}
	void sub(int a,int b,int c) {
		System.out.println("Subtraction Result = "+(a-b-c));
	}
	void sub(int a,int b,int c,int d) {
		System.out.println("Subtraction Result = "+(a-b-c-d));
	}
}
