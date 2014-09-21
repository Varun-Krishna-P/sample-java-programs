package code.practise.WebExample;
public class DiamondStar {
	public static void main (String ar[]) throws InterruptedException{
		for (int i = 1;i <= 10;i++)
		{
			for (int j = 0;j <= 10-i;j++)
			{
				System.out.print(" ");
			}
			for (int j= 1;j < i;j++)
			{
				System.out.print("*");
				Thread.sleep(500);
			}
			for (int k = 1;k <= i;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = 10; i > 0; i--) 
		{
			for (int j = 0 ; j <= 10-i; j++)
			{
				System.out.print(" ");
			}
			for ( int j = 1; j < i; j++){
				System.out.print("*");
				Thread.sleep(500);
			}
			for (int k = 1; k<=i;k++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	 
}
