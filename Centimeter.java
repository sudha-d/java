import java.util.Scanner;
public class Centimeter
{
	public static void main(String[] args) 
	{
		double centimeter,kilometer,meter ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in centimeter :");
		 centimeter = sc.nextDouble();
		meter = centimeter/100.0;
		kilometer = centimeter/100000.0;
		System.out.println("length in meter ="+meter+"meter");
		System.out.println(" length in kilometer ="+kilometer+"kilometer");
	}
}
