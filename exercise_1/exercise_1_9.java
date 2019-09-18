import java.util.*;
import java.util.Scanner;
class exercise_1_9{
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        char[] c = str.toCharArray();
        int l=str.length();
        for(int i=l-1;i>=0;i--){
            System.out.print(c[i]);
        }


    }

    
}