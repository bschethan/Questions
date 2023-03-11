import java.util.ArrayList;
import java.util.ListIterator;
class Test {
	static int result =0;
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        
           // Writing output to STDOUT
    	int N=7;
    	ArrayList<Integer> l = new ArrayList<Integer>();
    	for(int i=0;i<N;i++) {
    		l.add(i+1);
    	}
    	System.out.println(shotOnTarget(l));
    	
    }
    
    public static int shotOnTarget(ArrayList<Integer> a) {	
    	int count=0;
    	ArrayList<Integer> b = new ArrayList<Integer>();
    	ListIterator it = a.listIterator();
    	while(it.hasNext()) {
    		int temp =(int) it.next();
    		if((count%2==0)) {
    			result = result+temp;
    			b.add(temp);
    		}
    		count++;
    	}
    	a.removeAll(b);
    	if(a.size()==1) {
    		return result;
    	}else {
    		b.clear();
    		return shotOnTarget(a);
    	}
    }
}
