import java.util.*;
import java.util.Scanner;
class exercise_1_1{
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int l=0;
        while(temp!=0){
            temp=temp/10;
            l++;
        }
        int[] arr= new int[l];
        temp=num;
        int i=0;
        while(temp!=0){
            arr[i]=temp%10;
            i++;
            temp=temp/10;
        }
        int flag=0;
        int sum=0;
        for(int k=0;k<l;k++){
            if(arr[k]!=arr[l-k-1]){
                flag=1;
                
            }
            if(arr[k]%2==0){
                sum=sum+arr[k];
            }

        }
        if(flag==0 && sum>25)
        System.out.println(num+"is palindrome and the sum is greater than 25");
        else if(flag==0 && sum<25)
        System.out.println(num+"is palindrome and the sum is less than 25");
        else
        System.out.println(num +"is not palindrome");


    }
   
}