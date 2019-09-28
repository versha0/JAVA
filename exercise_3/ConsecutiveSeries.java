import java.util.*;
import java.lang.*;
class ConsecutiveSeries{
    public static void main(String[] args){
        System.out.println("Enter space separated seven numbers");
        Scanner sc= new Scanner(System.in);
        String series= sc.nextLine();
        String[] temp= series.split(" ");
        int length=temp.length;
        int[] numbers= new int[length];
        for(int i=0;i<length;i++){
            numbers[i]=Integer.parseInt(temp[i]);

        }
        int flag=1;
        for(int i=0;i<length-1;i++){
            if(numbers[i+1]!=(numbers[i]+1)){
                flag=0;
                break;
            }

        }

        if(flag==1)
        System.out.println("The number enterd are consecutive");
        else
        System.out.println("The numbers entered are not consecutive");
    }
}
