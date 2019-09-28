import java.io.File;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Map.Entry;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileFrequency {
    public static void main (String[] args) throws IOException {
      String fileName="/home/cgi/Desktop/javaa/exercise_3/FileDemo.txt";
      
      StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        //System.out.println(sb);
        String content=sb.toString();
        String content1=content.replaceAll(",","");
      
        System.out.println(content1);
        String[] contentArray=content1.split(" ");
        HashMap<Integer,String> hashmap= new HashMap<>();
        int i=0;
        for(String s:contentArray){
           if(!(hashmap.containsValue(s))){
            hashmap.put(i,s);
            i++;
           }
        }
      int[] freq=new int[hashmap.size()];
      i=0;
      for(Entry<Integer,String> m:hashmap.entrySet()){
         for(int k=0;k<contentArray.length;k++){
            String temp=m.getValue();
            
            if(temp.equals(contentArray[k])){
               freq[i]++;
            }
            
         }
         i++;
      }
      System.out.println(hashmap);
      for(int k=0;k<freq.length;k++){
         System.out.println(freq[k] + hashmap.get(k));
      }
      
      
    }
   }