import java.util.Scanner;
class  DivisibleOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number1 = sc.nextInt();
		if (number1 % 5 == 0 && number1 % 11 == 0)
		{
			System.out.println("number is divisible by 5 and 11 "+number1);
		}
		else 
		{ 
			System.out.println("number is not divisible by 5 and 11"+number1);
		}
	}
}
