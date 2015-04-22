import java.math.BigDecimal;
import java.util.Scanner;

public class B1002_1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String num = input.next();
    BigDecimal number = new BigDecimal(num) ;
    
    int sum = sum(number);
    output(sum);
    
  }
  
  public static int sum(BigDecimal number) {
	  int sum = 0;
	  BigDecimal num1 = new BigDecimal(1);
	  BigDecimal num10 = new BigDecimal(10);	  
	    
	  while (number.compareTo(num1) >= 0)
	  {
		  BigDecimal getNumber = number.remainder(num10); 
		  sum += getNumber.intValue();
		  number = number.divide(num10);
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