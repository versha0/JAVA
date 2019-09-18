import java.util.*;
import java.util.Arrays;
class Student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] array= new int[num];

        for(int i=0;i<num;i++){
            System.out.println("Enter number for the student "+ i);
            array[i]= sc.nextInt();

        }
        avg(num,array);
        maxandmin(num, array);

    }
    public static void avg(int n, int[] arr){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];

        }
        float f=sum/n;
        System.out.println("Average is"+ f);
    }
    public static void maxandmin(int n,int[] arr){
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]<min)
            min=arr[i];
            if(arr[i]>max)
            max=arr[i];

        }
        System.out.println("Maximum number is"+ max);
        System.out.println("Minimum number is"+ min);

    }
}