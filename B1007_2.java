import java.util.Scanner;

public class B1007_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		System.out.println(numberOfPrimePair(number));				
	}
	
	public static int numberOfPrimePair(int number) {
		int sum = 0;
		for (int i = 2,temp = -1; i <= number; i ++)
		{
			if (isPrime(i))
			{
				if (i - temp == 2)
				{
					sum ++;
				}
				
				temp = i;
			}
			
		}
		
		return sum;
	}
	
	public static boolean isPrime(int number) {
		boolean isPrime = true; 
		
		for (int i = 2; i <= Math.pow(number, 0.5); i ++)
		{
			if (number % i == 0)
			{
				isPrime = false;
			}
		}
		
		return isPrime;
	}

}