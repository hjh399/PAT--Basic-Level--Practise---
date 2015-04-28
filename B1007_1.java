import java.util.Scanner;

public class B1007_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		System.out.println(numberOfPrimePair(number));				
	}
	
	public static int numberOfPrimePair(int number) {
		int sum = 0;
		
		for (int i = 1,d = 0; i < primeNumber(number).length - 1; i ++)
		{
			 d = primeNumber(number)[i + 1] - primeNumber(number)[i];
			 if (d == 2)
			 {
				 sum ++;
			 }
		}
		
		return sum;
	}
	
	public static int[] primeNumber(int number) {	
		int amount = 0;
		
		for (int i = 1; i <= number; i ++)
		{
			if (isPrime(i))
			{
				amount ++;
			}
		}
	
		int[] p = new int[amount];

		for (int i = 1,a = 0; i <= number; i ++)
		{
			if (isPrime(i))
			{
				p[a] = i; 
				a ++;
			}
		}
		
		return p;
	}
	
	public static boolean isPrime(int number) {
		boolean isPrime = true; 
		
		for (int i = 2; i <= number / 2; i ++)
		{
			if (number % i == 0)
			{
				isPrime = false;
			}
		}
		
		return isPrime;
	}

}