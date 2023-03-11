
public class CountDuplicate {
	
	static int[] counter  = new int[255];

	public static void main(String[] args) {
	 String a ="aabbbcdddd";
	 char achar[] = a.toCharArray();
	 for(int i=0;i<a.length();i++) {
		 counter[achar[i]]++;
	 }
	 for(int i=0;i<counter.length;i++) {
		 if(counter[i]>1) {
			 System.out.println((char) i +"-----------"+counter[i]);
		 }
	 }
	}

}
