
public class isPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrimeNumber(13));
	}

	public static boolean isPrimeNumber(int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}
