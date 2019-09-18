import java.util.*;
class prob6{
    public static void main(String args[]){
        

        for(int i=1;i<10;i++){
            int f=factorial(i);
            System.out.println("Factorial of "+i + "is"+f);
            
        }
    }
    public static int factorial(int n){
        int f=1;
      
        for(int k=1;k<=n;k++){
            f= f*k;
        }
           return f; 
        
    }
}