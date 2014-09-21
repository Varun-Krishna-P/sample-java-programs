/**
 * http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 */
package code.practise.WebExample;

/**
 * @author Varunkrishna
 *
 */

public class EnumTest {
	public enum Day {
		SUNDAY, MONDAY,TUESDAY,WEDNESDAY,THURSDAY, FRIDAY,SATURDAY
	}
	Day day;
	
	public EnumTest (Day day){
		this.day = day;
	}
	
	public void tellLikeitIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");			
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY : case SUNDAY :
			System.out.println("The weekends are the best.");
			break;
		default:
			System.out.println("The Mid weeks are the best.");
		break;		
		}
		
	}
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellLikeitIs();
		
		EnumTest secondDay = new EnumTest(Day.TUESDAY);
		secondDay.tellLikeitIs();
		
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellLikeitIs();
		
		EnumTest fourthDay = new EnumTest(Day.THURSDAY);
		fourthDay.tellLikeitIs();
		
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellLikeitIs();
		
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellLikeitIs();
		
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellLikeitIs();
	}

}
