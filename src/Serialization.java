import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Suren", "Morgan Stanley");
		map.put("Siva", "Tata");
		map.put("Mohan", "Cognizant");
		Set<Entry<String,String>> set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Entry<String,String> en = (Entry<String,String>)it.next();
			System.out.println(en.getKey()+"------------"+en.getValue());
		}
		
		FileOutputStream fos = new FileOutputStream("output.serr");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(map);
		oos.flush();
		oos.close();
		
		FileInputStream bf = new FileInputStream("output.serr");
		ObjectInputStream ois = new ObjectInputStream(bf);
		Map ob = (Map) ois.readObject();
		Set<Entry<String,String>> map1 = ob.entrySet();
		for(Entry<String,String> s:map1) {
			System.out.println(s.getKey()+"-----------"+s.getValue());
		}

	}

}
