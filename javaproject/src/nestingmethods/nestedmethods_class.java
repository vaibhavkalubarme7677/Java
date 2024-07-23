package nestingmethods;

public class nestedmethods_class {

	void data1(int A, int B)
	{
		System.out.println("A " + A + "B " + B);
		data2(20, 30);
	}
	void data2(int X, int Y)
	{
		System.out.println("X " + X + "Y " + Y);
	}

}
	

