import java.util.Scanner;

public class B1011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i ++)
		{
			long a = input.nextInt();
			long b = input.nextInt();
			long c = input.nextInt();
			
			boolean dayu = a + b > c;
			
			System.out.println("Case #" + i + ": " + dayu);
		}
	}
}