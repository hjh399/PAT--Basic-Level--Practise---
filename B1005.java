import java.util.Arrays;
import java.util.Scanner;

public class B1005 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int n = input.nextInt();
	  int[][] num = new int[n][2];
	  int sum = n;
	  
	  for (int i = 0 ; i < n ; i ++)
	  {
		  num[i][0] = input.nextInt();
		  num[i][1] = -1;
	  }
	  
	  for (int i = 0 ; i < n ; i ++)
	  {
		  int a = num[i][0];
		  while (a != 1)
		  {
			  a = (a % 2 == 0)? a / 2 : (3 * a + 1) / 2;
			  
			  for (int j = 0; j < n;j ++)
			  {
				  if (a == num[j][0] && num[j][1] != 1)
				  {
					  num[j][1] = 1;
					  sum --;
				  }
			  }
		  }		  
	  }
	  
	  int[] key = new int[sum];
	  int a = 0;
	  for (int i = 0; i < n; i ++)
	  {
		  if (num[i][1] == -1)
		  {
			  key[a] = num[i][0];
			  a++;
		  }
	  }
	  
	  Arrays.sort(key);
	  for (int i = sum; i > 0; i --)
	  {
		  System.out.print(key[i - 1]);
		  if (i > 1)
		  {
			  System.out.print(" ");
		  }
	  } 
  }
}