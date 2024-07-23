package Interface;

public class studentclass implements studentinterface{

	@Override
	public void studentdetails(String Name, String Std, char Div) {
		// TODO Auto-generated method stub
		
		System.out.println("Student Details: \nStudent Name = "+Name+"\nStudent Std = "+Std+"\nStudent Div = "+Div);
		
	}

	@Override
	public void studentMarks(int Marks) {
		// TODO Auto-generated method stub
		
		System.out.println("Marks = "+Marks);
		
	}

	@Override
	public void studentGrades(char Grade) {
		// TODO Auto-generated method stub
		
		System.out.println("Grade = "+Grade);
		
	}

}
