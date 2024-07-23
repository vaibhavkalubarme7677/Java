package Test_method_overloading;

public class MethodOverloadingExample {
	// Method with two integer parameters
	static int add(int a, int b) {
        return a + b;
	}
	 // Method with three integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Testing the overloaded methods
    	
    	System.out.println("Output: ");
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of three integers: " + add(5, 10, 15));
  
    }
	
}//6.Write a program for method overloading?
	
