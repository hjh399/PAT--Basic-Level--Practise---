import java.util.Scanner;

public class B1003 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] pat = new String[n];
		
		for (int i = 0; i < n; i ++)
		{
			pat[i] = input.next();
			
			String yesOrNo = (pat(pat[i]) && a(pat[i]))? "YES" : "NO";
			System.out.println(yesOrNo);
		}		
	}
	
	public static boolean pat(String pat) {
		boolean pt = true;
		
		int p = pat.indexOf("PA");
		
		if (p < 0)
		{
			pt = false;
		}
	
		if (pt)
		{
			int t = pat.indexOf("T", p);
			if (t < 0)
			{
				pt = false;
			}
		}
				
		return pt;
	}
	
	public static boolean a(String pat) {
		boolean aaa = true;
		int p = pat.indexOf("P");
		int t = pat.indexOf("T", p);

		for (int i = 0; i < p; i++)
		{
			char A = pat.charAt(i);
			if (A != 'A')
			{
				aaa = false;
				break;
			}
		}
		
		if (aaa)
		{
			for (int i = p + 1; i < t; i++)
			{
				char A = pat.charAt(i);
				if (A != 'A')
				{
					aaa = false;
					break;
				}
			}
		}
		
		if (aaa)
		{
			for (int i = t + 1; i < pat.length(); i++)
			{
				char A = pat.charAt(i);
				if (A != 'A')
				{
					aaa = false;
					break;
				}
			}
		}
		
		if (aaa)
		{
			aaa = (p * (t - p - 1) == (pat.length() - t - 1) || (p == (pat.length() - t - 1)));
		}
		
		return aaa;
	}
}