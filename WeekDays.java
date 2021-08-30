import java.util.Scanner;
public class  WeekDays 
{
	public static void main(String[] args) 
	{
		int days;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter days");
		days = sc.nextInt();
		int years = days/365;
		days = days - years*365;
		int weeks = days/7;
		days = days - weeks*7;
		System.out.println(years+"years "+weeks+"weeks "+days+"days");
	}
}
