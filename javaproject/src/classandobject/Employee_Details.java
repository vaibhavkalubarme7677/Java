package classandobject;

public class Employee_Details {

	void empData(String name,int empid,int age,int sal) {
		System.out.println("Employee Details: ");
		System.out.println("Name= " +name);
		System.out.println("Empid= "+ empid);
		System.out.println("Age= "+age);
		System.out.println("Salary= "+sal);
	}
	void designation(int sal) {
		if(sal<=20000) {
			System.out.println("He is a Non-IT Employee");
			
		
		}
		else if(sal>20000 && sal<=40000)
			System.out.println("He is IT Employee with support role");
	}
	
	
}
