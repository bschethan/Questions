import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateUsingMAP {

	public static void main(String[] args) {
	
		String a = "selenium";
		char[] achar = a.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<achar.length;i++) {
			if(map.containsKey(achar[i])) {
				map.put(achar[i], map.get(achar[i])+1);
			}else {
				map.put(achar[i], 1);
			}
		}
		Set<Entry<Character,Integer>> set  = map.entrySet();
		for(Entry<Character,Integer> g: set) {
			if (g.getValue()>1) {
				System.out.println(g.getKey()+"----------------"+g.getValue());
			}
		}
	}

}
