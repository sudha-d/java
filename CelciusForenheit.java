import java.util.Scanner;
public class CelciusForenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Celcius");
		double Celcius = sc.nextDouble();
		double Forenheit = (Celcius*9/5)+32;
		System.out.println("Celcius in Forenheit is =:"+Forenheit);
	}
}
