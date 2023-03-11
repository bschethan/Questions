import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("Suren", "Morgan Stanley");
		map.put("Siva", "Tata");
		map.put("Mohan", "Cognizant");
		Map<String,String> sormap = sortedMap(map);
		Set<Entry<String,String>> set  = sormap.entrySet();
		for(Entry<String,String> m:set) {
			System.out.println(m.getKey()+"-----------------"+m.getValue());
		}
		
	}

	private static Map<String, String> sortedMap(Map<String, String> map) {
		List llList = new LinkedList(map.entrySet());
		Collections.sort(llList, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return   ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			
			}
			
		});
		Map map1 = new LinkedHashMap();
		Iterator it = llList.iterator();
		while(it.hasNext()) {
			Entry<String,String> m = (Map.Entry) it.next();
			map1.put(m.getKey(),m.getValue());
		}
		return map1;
	}

}
