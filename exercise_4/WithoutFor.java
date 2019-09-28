import java.util.*;
import java.lang.*;
class WithoutFor{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str= sc.nextLine();
        System.out.println("Enter the characyet you want to count");
        char ch= sc.next().charAt(0);
        String word=Character.toString(ch);
        String[] Strarray= str.split(word);
        int repetition;
        if(str.charAt(str.length()-1)==' '){
           repetition=Strarray.length-1;
        }
        else{
           repetition=Strarray.length;
        }
        System.out.println("The character " + ch+ "is repeated" + repetition + "times");
        

    }
}