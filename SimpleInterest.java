import java.util.Scanner;
public class SimpleInterest
{
	public static void main(String[] args) 
	{
		float amount;
		float rateOfInterest;
		int time;
		float interest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		amount = sc.nextFloat();
		System.out.println("Enter the rate0fInterest");
		rateOfInterest = sc.nextFloat();
		System.out.println("Enter the time ");
		time = sc.nextInt();
		interest = (amount*rateOfInterest*time)/100;
		System.out.println("Interest Amount ="+interest);
		
	}
}
