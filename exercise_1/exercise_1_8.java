import java.util.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class exercise_1_8{
    public static void main(String[] args) {
        int mynum=45;
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int temp= sc.nextInt();
            if(temp==mynum){
            System.out.println("Match found");
            break;
            }
            else if(temp>mynum)
            System.out.println("The number is smaller");
            else 
            System.out.println("the number is greater");
        }


    }

    
}