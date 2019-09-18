import java.util.*;
import java.util.Scanner;
class exercise_1_4{
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
        }

    }
    

}