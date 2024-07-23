package inheritance;

public class h_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		h_child1 c1=new h_child1();
		c1.a=50;
		c1.b=30;
		c1.parentdata();
		c1.add();


		h_child2 c2=new h_child2();
		c2.a=50;
		c2.b=45;
		c2.parentdata();
		c2.sub();

		
		h_grandchild c3=new h_grandchild();
		c3. a=20;
		c3. b=5;
		c3.parentdata();
		c3. div();
			}

		
	

}
