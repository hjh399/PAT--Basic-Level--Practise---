import java.util.Scanner;

public class B1004 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    int amount = input.nextInt();       
    
    String highestName = input.next();
  String highestID = input.next();
  int highestScore = input.nextInt();

    String lowestName = highestName;
  String lowestID = highestID;
  int lowestScore = highestScore;
    
    for (int i = 1; i < amount; i ++)
    {
      String name = input.next();
        String studentID = input.next();
        int achievement = input.nextInt();
        
        if (achievement > highestScore )
        {
          highestName = name;
          highestID = studentID;
          highestScore = achievement;
        }

        else if (achievement < lowestScore )
        {
          lowestName = name;
          lowestID = studentID;
          lowestScore = achievement;
        }
    }
    
    System.out.println(highestName + " " + highestID);
    System.out.print(lowestName + " " + lowestID);
  }
  
}
