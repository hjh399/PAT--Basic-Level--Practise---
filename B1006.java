import java.util.Scanner;

public class B1006 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		int num = Integer.parseInt(number);

		int g = num % 10;
		num /= 10;
		
		int s = num % 10;
		num /= 10;
		
		int b = num % 10;
		num /= 10;
		
		
		switch (number.length()){
			case 1:g(g);break;
			case 2:s(s);g(g);break;
			case 3:b(b);s(s);g(g);break;
		}
		
	}
	
	public static void g(int number) {
		for (int i = 1; i <= number; i ++)
		{
			System.out.print(i);
		}
	}
	
	public static void s(int number) {
		for (int i = 1; i <= number; i ++)
		{
			System.out.print("S");
		}
	}
	
	public static void b(int number) {
		for (int i = 1; i <= number; i ++)
		{
			System.out.print("B");
		}
	}
}