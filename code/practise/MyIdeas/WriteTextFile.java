package code.practise.MyIdeas;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class WriteTextFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		String name, email;
		final String EMAIL_PATTERN = 
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		PrintWriter printwriter = new PrintWriter("User Details.txt");
		printwriter.println("+-----+--------------------+--------------------+");
		printwriter.printf("|%-5s|%-20s|%-20s|\r\n","S.no","Name","Email");
		printwriter.printf("+-----+--------------------+--------------------+\r\n");
		try {
			A:for(int i = 1;;i++){					
				System.out.println("Please enter the name:");
//				System.out.println("You can quit by pressing enter key...");
				name = input.nextLine();
				System.out.println("Please enter the email:");
				email = input.nextLine();
				if(!email.matches(EMAIL_PATTERN)){					
					System.out.println("Please enter a valid email.\nThe details are not saved please start from the beginning.");
					i--;
//					break;
					continue;
				}
				else
				{
					printwriter.printf("|%5s|%20s|%20s|\r\n",i,name,email);
					printwriter.printf("+-----+--------------------+--------------------+\r\n");					
				}
					

				for(;;){				
					if(i>=1){					
						System.out.println("Do you wish to continue ?(y/n)");
						String quit = input.nextLine();		
						if(quit.equalsIgnoreCase("n"))break A;
						else if (quit.equalsIgnoreCase("y")){
							continue A;

						}
						else
						{
							System.out.println("Please enter either 'y' or 'n'");
							continue;
						}

					}					
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			input.close();
			printwriter.close();
		}
	}

}
