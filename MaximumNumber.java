import java.util.Scanner;
class  MaximumNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);;
		System.out.println(" enter any number ");
		int number1 = sc.nextInt();
		System.out.println("enetr any number");
		int number2 = sc.nextInt();
		if (number1 > number2)
		{
			System.out.println(" number1 is greater " +number1);

		}
		else 
		{
			System.out.println(" number2 is greater "+number2);
		}
	}
}
