import java.util.*;
import java.lang.*;
class SortArray{
    public static void main(String[] args){
        System.out.println("Enter any String of your choice");
        Scanner sc = new Scanner(System.in);
        String S= sc.nextLine();
        String[] Arr= S.split(" ");
        Arrays.sort(Arr);
        System.out.println("Your array is alphabetical order is");
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }

    }

}