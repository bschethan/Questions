
public class AmstrongNumber {

	public static void main(String[] args) {
		System.out.println(isAmstrongNumber(153));

	}
	
	public static boolean isAmstrongNumber(int a) {
		int temp =0;
		int r = 0;
		int data = a;
		while(a>0) {
			r = a%10;
			temp = temp+(r*r*r);
			a = a/10;
		}
		if(temp ==data) {
			return  true;
		}else{
			return false;
		}
	}

}
