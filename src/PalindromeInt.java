
public class PalindromeInt {

	public static void main(String[] args) {
		System.out.println(isPalindromeInt(1231));

	}

	public static boolean isPalindromeInt(int a) {
		int r = 0;
		int temp = 0;
		int data = a;

		while (a > 0) {
			r = a%10;
			temp = (temp*10)+r;
			a = a/10;
		}
		if(temp ==data) {
			return true;
		}else {
			return false;
		}
	}
}
