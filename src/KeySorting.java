import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class KeySorting {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Suren", "Morgan Stanley");
		map.put("Siva", "Tata");
		map.put("Mohan", "Cognizant");
		
		TreeMap<String,String> treemap = new TreeMap<String,String>(map);
		Set<Entry<String,String>> set = treemap.entrySet();
		for(Entry<String,String> d: set) {
			System.out.println(d.getKey()+"---------------"+d.getValue());
		}
	}

}
