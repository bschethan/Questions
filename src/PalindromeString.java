import java.util.ArrayList;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println(isPalindrome("121"));

	}

	public static boolean isPalindrome(String s1) {
//		char [] c1 = s1.toCharArray();
		ArrayList<Character> al = new ArrayList<Character>();
		for(int i=0;i<s1.length();i++) {
			if(al.contains(s1.charAt(i))) {
				al.remove((Character)s1.charAt(i));
			}else {
				al.add(s1.charAt(i));
			}
		}
		if(((s1.length()%2 ==0)&& (al.size()==0)) || ((s1.length()%2==1 && al.size()==1))){
			return true;
		}else {
			return false;
		}
	}
}
