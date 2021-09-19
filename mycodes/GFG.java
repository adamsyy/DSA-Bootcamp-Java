// importing java libraries.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// class for iterating HashMaps.
public class GFG {
	public static void main(String[] arguments) {
		// creating hash_map.
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		// inserting value.
		hash_map.put(1, "Thor");
		hash_map.put(2, "Iron man");
		// setting up iterator.
		Iterator<Entry<Integer, String>> it = hash_map.entrySet().iterator();
		// iterating every set of entry in the HashMap. 
		while (it.hasNext()) {
			Map.Entry<Integer, String> set = (Map.Entry<Integer, String>) it.next();
			System.out.println(set.getKey() + " = " + set.getValue());
		}
	}
}