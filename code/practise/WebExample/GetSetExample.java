package code.practise.WebExample;
import java.util.Scanner;

public class GetSetExample {

	public static void main(String args[]){
		String name;
		System.out.println("Please enter the employee's name:");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		Emp employee = new Emp();
//		employee.setEmployeeName("ASDF");
		employee.setEmployeeName(name);
//		employee.getEmployeeName();	
		System.out.println("The name of the employee is: "+employee.getEmployeeName());
		input.close();
	}
}

  class Emp {
	  String name;
	public String getEmployeeName()
	{
//		System.out.println(name);
		return name;
	}
	
	public void setEmployeeName(String aName)
	{
		
		this.name = aName;
//		System.out.println(name);		
	}
}
