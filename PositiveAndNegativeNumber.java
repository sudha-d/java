import java.util.Scanner;
class PositiveAndNegativeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any number");
		int number  = sc.nextInt();
		if (number < 0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("positive number");
		}
		
	}
}
