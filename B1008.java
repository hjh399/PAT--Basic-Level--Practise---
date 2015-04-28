import java.util.Scanner;

public class B1008 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i ++)
		{
			a[i] = input.nextInt();
		}
		
		if (n < m)
		{
			m = m - n;
		}
		
		if (m != 0)
		{
			for (int i = 0, j = n - m; i < m; i ++, j ++)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;					
			}
			
			for (int i = m, j = n - m; i < n - m; i ++, j ++)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;					
			}	
		}
		
		for (int i = 0; i < n; i ++)
		{
			System.out.print(a[i]);
			if (i == n - 1)
			{
				break;
			}
			System.out.print(" ");
		}
	}
}