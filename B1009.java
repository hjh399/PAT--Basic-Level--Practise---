import java.util.Scanner;

public class B1009 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String words = input.nextLine();
		String [] word = words.split(" ");		
		
		for (int i = word.length - 1; i >= 0; i --)
		{
			System.out.print(word[i]);
			if (i != 0)
			{
				System.out.print(" ");
			}
		}			
	}
}