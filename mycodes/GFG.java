
// importing java libraries.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// class for iterating HashMaps.
public class GFG {
    public static void main(String[] arguments) {
        // creating hash_map.
        Map<String, String> hash_map = new HashMap<>();
        // inserting value.
        hash_map.put("1", "Thor");
        hash_map.put("2", "Iron man");
        // setting up iterator.

   for(Map.Entry<String,String> entry:hash_map.entrySet()){
       if(entry.getKey().contains("1")){System.out.println(entry.getKey());}
       
   }
    }
}   