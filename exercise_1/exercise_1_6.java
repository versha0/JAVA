import java.util.*;
import java.util.Scanner;
import java.io.*;
class exercise_1_6{
    public static void main(String[] args) {
    
        char c;
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        c=str.charAt(0);
        int ascii=(int)c;
        if(ascii>64 && ascii<91)
        System.out.println("Capital Letter");
        else if(ascii>96 && ascii<123)
        System.out.println("Small Letter");
        else if(ascii>47 && ascii<58)
        System.out.println("Digit");
        else
        System.out.println("Special Symbol");
    
    

    }
}