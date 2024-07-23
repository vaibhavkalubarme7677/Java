package multipleinheritance;

public class normal_class implements InterfaceA, InterfaceB {

	@Override
	public void Bdata() {
		// TODO Auto-generated method stub
		
		System.out.println("X= "+x+ " Y= "+y);
		
	}

	@Override
	public void Adata() {
		// TODO Auto-generated method stub
		
		System.out.println("A= "+a+" B= "+b);
		
	}
	
	
}
