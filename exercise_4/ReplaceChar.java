import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
class ReplaceChar{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String myStr= sc.nextLine();
        StringBuilder str= new StringBuilder();
        for(int i=0;i<myStr.length();i++){
            if(myStr.charAt(i)=='d')
            str.append('f');
            else if(myStr.charAt(i)=='l')
            str.append('t');
            else 
            str.append(myStr.charAt(i));
        }
        String fin=str.toString();
        System.out.println(fin);

    }
}