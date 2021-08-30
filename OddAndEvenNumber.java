import java.util.Scanner;
class OddAndEvenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number ");
		int number = sc.nextInt(); 
		if (number % 2 == 0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}
