import java.util.Scanner;
public class ForenheitCelcius  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temparature Forenheit");
		double Forenheit = sc.nextDouble();
		double Celcius = (Forenheit - 32)*5/9;
		System.out.println("the Foreinheit celcius =:"+Celcius);
	}
}
