import java.util.Scanner;
import java.util.regex.*;  
class RegexPattern{  
   public static void main(String args[]){  

        System.out.println("Enter any string");
        Scanner sc = new Scanner(System.in);
      String content = sc.nextLine();
      String pattern = ".*Harry.*";

      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("The text contains 'Harry'? " + isMatch);
   }
}  