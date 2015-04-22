import java.util.Scanner;

public class B1002 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String num = input.next();
    
    
    int sum = sum(num);
    output(sum);
    
  }
  
  public static int sum(String number) {
	  int sum = 0;
	  
	  for (int i = 0; i < number.length(); i ++)
	  {
		  Character charNumber = number.charAt(i);
		  int num = Integer.parseInt(charNumber.toString());
		  sum += num;
	  }
	  	    
	  return sum;  
  }
  
  public static void output(int sum) {
	  String output = "";
	  output = pinyin(sum % 10);
	  sum /= 10;
	  
	  while (sum >= 1)
	  {
		  output = pinyin(sum % 10) + " " + output; 
		  sum /= 10;
	  }
	  
	  System.out.print(output);
  }
  
  public static String pinyin(int number) {
	  String pinyin = "";
	  
	  switch (number){
	  case 0:pinyin = "ling";break;
	  case 1:pinyin = "yi";break;
	  case 2:pinyin = "er";break;
	  case 3:pinyin = "san";break;
	  case 4:pinyin = "si";break;
	  case 5:pinyin = "wu";break;
	  case 6:pinyin = "liu";break;
	  case 7:pinyin = "qi";break;
	  case 8:pinyin = "ba";break;
	  case 9:pinyin = "jiu";
	  default : break;
	  }
	  
	  return pinyin;
  }
  
}
