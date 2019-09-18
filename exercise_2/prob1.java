import java.util.*;
import java.util.Scanner;
class prob1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        reverse(str);
    }
    public static void reverse(String str){
        int l=str.length();
        char[] c= str.toCharArray();
        int flag=0;
        for(int k=0;k<l;k++){
            if(c[k]!=c[l-k-1]){
                flag=1;
                break;
            }
    }
    if(flag==0)
    System.out.println("The input is palindrome");
    else
    System.out.println("The input is not palindrome");
    }
}