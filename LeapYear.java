import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Year to find out if it has a "
				+ "leap year: ");
		
		int leapY = scan.nextInt();
		
		if(leapY % 4 == 0 || leapY % 400==0 && leapY % 10 !=0 ) 
		
		{
			System.out.println("The year is a leap year!");
		}
		
		else
		{
			System.out.println("The year is not a leap year!");
		}
		
	}

}
