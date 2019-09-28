import java.io.File;
import java.io.*;
import java.lang.*;
import java.util.*;

 
public class FileList {
    public static void main (String[] args) throws IOException {

    File file = new File("/home/cgi/Desktop/javaa/exercise_3/");
       String[] files = file.list();
       System.out.println("All my files in te folder are:");
       for(String f: files){
           //String temp=f.getname();
           System.out.println(f);
         }
        String extension= ".txt";
        String filtered="";
        System.out.println("All the files with extension of .txt");
        for(String f: files){
          
            
              //  System.out.println(str);
            if(f.contains(".txt")){
           filtered= filtered + f+ " ";
            }
        }
        //System.out.println(filtered);
           String[] filteredarr= filtered.split(" ");
           for(String f: filteredarr){
           System.out.println(f);
}
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the file you wanna read");

    String filename=sc.next();
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
                   String firstline = reader.readLine();
                   reader.close();
                   String secondline =firstline.toUpperCase();
                   int length = firstline.length();
                   System.out.println(secondline);

}}