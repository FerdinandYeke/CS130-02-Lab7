import java.util.Scanner;
import java.text.NumberFormat;


public class GasLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		NumberFormat fmt1 = NumberFormat.getPercentInstance();
		
		System.out.println("Enter the Capacity of your gas tank: ");
		float Capacity = scan.nextFloat();
		
		System.out.println("Enter the amount of gas left: ");
		float amountL = scan.nextFloat();
		
		float level = amountL/Capacity;
		
		if(level < 0.25) 
		{
			System.out.println("The level of the gas tank is "+fmt1.format(level)+
					", which is less then a quarter (0.25) of a tank.");
		}
		
		else if(level < 0.50) 
		{
			System.out.println("The level of the gas tank is "+fmt1.format(level)+
					", which is less then a half (0.50) of a tank.");
		}
		else if(level < 0.75) 
		{
			System.out.println("The level of the gas tank is "+fmt1.format(level)+
					", which is less then three quarters (0.75) of a tank.");
		}
		
		else 
		{
			System.out.println("The level of the gas tank is "+fmt1.format(level)+
					", which is almost full.");
		}
	}

}
