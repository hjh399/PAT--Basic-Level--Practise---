import java.util.Scanner;

public class B1001 {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);	
		int n = input.nextInt();
		
		int count = 0;
		
		while (n != 1)
		{
			if (n % 2 == 0)
			{
				n /= 2;
				count ++;
			}
			else
			{
				n = (3 * n + 1) / 2;
				count ++;
			}
		}
		System.out.print(count);
	}
}  
