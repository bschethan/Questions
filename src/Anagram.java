import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("Keey", "peek"));

	}
	
	public static boolean isAnagram(String a,String b) {
		 if (! (a.length() == b.length())) {
			 return false;
		 }
		 char[] c1 = a.toLowerCase().toCharArray();
		 char[] c2 = b.toLowerCase().toCharArray();
		 Arrays.sort(c1);
		 Arrays.sort(c2);
		 return Arrays.equals(c1, c2);
	}

}
