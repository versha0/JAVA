import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class exercise_1_7{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        
        int temp=num;
        
        int i=0;
        while(temp!=0){
            
            i++;
            temp=temp/10;
        }
        temp=num;
        
        int[] arr= new int[i];
        i=0;
        while(temp!=0){
            arr[i]=temp%10;
            i++;
            temp=temp/10;
        }
        
        int sum=0;
        Arrays.sort(arr);
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
            if((arr[j]%2)==0){
            sum=sum+arr[j];
        }
        }
        System.out.println("Sum of even Numbers:"+ sum);
        if(sum>15)
        System.out.println(true);
        else
        System.out.println(false);

    }
    
}