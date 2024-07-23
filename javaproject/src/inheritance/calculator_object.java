package inheritance;

public class calculator_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator_parent c= new calculator_parent();
		c.heading();
		c.add(40, 60);
		c.sub(10, 5);
		c.mul(12, 12);
		c.div(20, 2);
		c.rem(45, 8);

	}
}

