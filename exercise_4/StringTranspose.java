import java.util.*;
import java.lang.*;
class StringTranspose{
    public static void main(String[] args){
        System.out.println("Enter a string of your choice");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder sb= new StringBuilder();
        String[] Arr= str.split(" ");
        for(int i=0;i<Arr.length;i++){
            char[] temp=Arr[i].toCharArray();
            int n= temp.length;
            for(int j=n-1;j>=0;j--){
                sb.append(temp[j]);
            }
            sb.append(" ");

        }
        String answer=sb.toString();
        System.out.println(answer);
    }
}