import java.util.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class exercise_1_3{
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int l= str.length();
        
        char[] ch= str.toCharArray();
        for(int i=0;i<l;i++){
            if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'|| ch[i]=='A'|| ch[i]=='E'|| ch[i]=='I'|| ch[i]=='O'|| ch[i]=='a'|| ch[i]=='U')
            System.out.print("Vowel  ");
            else 
            System.out.print("Consonant  ");
        
        }

    }
    
}