import java.util.*;
import java.util.Scanner;
class prob2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        ispowerof4(num);
        
    }
    public static void ispowerof4(int n){
        int temp=n;
        int flag=0;
        while(temp!=0 && temp!=1){
            if(temp%4!=0){
                flag=1;
                break;
            }
            else{
                temp=temp/4;
            }

        }
        if(flag==0)
        System.out.println("Number is the power of four");
        else
        System.out.println("number is not power of four");
    }
   
}