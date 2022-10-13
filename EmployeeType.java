import java.util.Scanner;


public class EmployeeType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Employee number that starts"
				+ " with 100, 200, 300, or 400: ");
		
		int EmployNum = scan.nextInt();
		
		switch(EmployNum) 
		{
			case 100: 
				System.out.println("100 is a General Manager");
			break;
			
			case 200: 
				System.out.println("200 is a Supervisor");
			break;
			
			case 300:
				System.out.println("300 is a Staff member");
			break;
			
			case 400:
				System.out.println("400 is a Contractor");
			break;
			
			default:
				System.out.println("Invalid Employee Number!");
			break;
			
		}
		
	}

}
