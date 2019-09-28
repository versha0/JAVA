import java.util.*;
import java.lang.*;
class FrequencySet{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String myStr= sc.nextLine();
        
          
        // similar to Matcher.replaceAll 
        myStr = myStr.replaceAll("\\p{Punct}"," "); 
        //System.out.println(myStr);
        Map<String,Integer> map= new HashMap<>();
        Map<String,Integer> mapResult= new HashMap<>();
        String[] myStrArray= myStr.split(" ");
        int i=0;
        for(String s:myStrArray){
            map.put(s,i);
            i++;
        }
        //System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String ss= entry.getKey();
            int count=0;
            for(String s:myStrArray){
                if(s.equals(ss)){
                    count++;
                }
            }
            mapResult.put(ss,count);
        }
        System.out.println("Your all the elements and their number of occurence");
        System.out.println(mapResult);
    }
}