package code.practise.WebExample;

public class ExceptionHandling {
	public static void main (String args[])
	{
		try
		{
			int a = 0 , d = 50 / a;
			System.out.println("The division of a number is:"+d);			
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());		
			exception.printStackTrace();
//			System.out.println("Division by Zero");
		}
	}

}
