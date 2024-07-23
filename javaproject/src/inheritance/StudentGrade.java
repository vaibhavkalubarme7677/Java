package inheritance;

public class StudentGrade extends StudentMarks {

	void grade(int mark)
	 {
		if(mark<=100 && mark>=80)
		 { 
			System.out.println("Grade: A");
		 }
	 }
	
}
