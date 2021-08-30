import java.util.Scanner;
class GreatestNumber  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number1 = sc.nextInt();
		System.out.println("enter any number");
		int number2 = sc.nextInt();
		System.out.println("enter any number");
		int number3 = sc.nextInt();
		if (number1 > number2 && number1 > number3)
		{
			System.out.println("number1 is greater" +number1);
		}
		else if(number2 > number1 && number2 > number3)
		{
			System.out.println("number2 is greater" +number2);
		}
		else if (number3 > number1 && number3 > number2)
		{
			System.out.println("number3 is greater" +number3);
		}

	}
}
