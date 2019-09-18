import java.util.*;
import java.util.Scanner;
class EvenNumTest{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        boolean g= isEven(num);
        if(g){
            System.out.println("Give number  is even");

        }
        else
        System.out.println("Given number is odd");
    }
    public static boolean isEven(int number){
        if(number%2==0)
        return true;
        else
        return false;
    }
}