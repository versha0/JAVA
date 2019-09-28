import java.util.*;
import java.lang.*;
class SortedSet{
    public static void main(String[] args){
        Set<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("Versha"); 
        hash_Set.add("Aaalll"); 
        hash_Set.add("bads"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(hash_Set); 
  
        // Set deonstration using TreeSet 
        System.out.print("Sorted Set after passing into TreeSet"); 
        Set<String> tree_Set = new TreeSet<String>(hash_Set); 
        System.out.println(tree_Set); 
        List<String> ls= new ArrayList<>();
        for(String s:tree_Set){
            ls.add(s);
        }
        System.out.println("My map is now converted in to a list");
        System.out.println(ls);
    }
}