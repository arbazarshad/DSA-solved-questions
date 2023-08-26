Code:
import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
         HashMap<Integer,Integer> hash = new HashMap<>();
            for(int i = 0;i<v.length;i++)
            {
                if(hash.containsKey(v[i]))
                {
                    hash.put(v[i], hash.get(v[i])+1);
                }
                else{
                    hash.put(v[i], 1);
                }
            }
            // this is an iterator which gets a next function for the given hash
            Map.Entry<Integer,Integer> hello = hash.entrySet().iterator().next();
            
            int min = hello.getValue();
            int max = hello.getValue();
            int max_key  = hello.getKey();
            int min_key = hello.getKey();
            
            // here we initialized a for loop for the hashmap so that we iterate through each set and check for the validation to attain results
            for(Map.Entry<Integer, Integer> e : hash.entrySet())
            {
                /*System.out.print(e.getKey() + " ");
                
                System.out.print(e.getValue());
                System.out.println(" ");*/
                if(max < e.getValue())
                {
                    max = e.getValue();
                    max_key = e.getKey();
                }
                if(min>e.getValue())
                {
                    min = e.getValue();
                    min_key = e.getKey();
                }
                if(min == e.getValue() && min_key > e.getKey())
                {
                    min_key = e.getKey();
                }
                if(max == e.getValue() && max_key > e.getKey())
                {
                    max_key = e.getKey();
                }
               
            }
            //System.out.println(min_key + " " + max_key);
            int[] res = {max_key,min_key};
            return res;
        
    }
} 
