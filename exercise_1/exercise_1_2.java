import java.util.*;
import java.util.Scanner;
class exercise_1_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=20 && n<=30){
            if(n%2==0)
            System.out.println("Tom");
            else
            System.out.println("Jerry");
        }
    }
}