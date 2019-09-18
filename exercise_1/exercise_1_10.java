import java.util.*;
import java.util.Scanner;
class exercise_1_10{
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no.");
        int num= sc.nextInt();
        System.out.println("enter string");
        Scanner scc=new Scanner(System.in);
        String str= scc.nextLine();
        char[] ch= str.toCharArray();
        int l=str.length();
        String temp="";
        for(int i=l-num;i<l;i++){
            temp=temp+ ch[i];
        }
        for(int i=1;i<=num;i++){
            str=str+temp;
        }
        System.out.println(str);
    }

    
}