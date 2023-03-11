
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorial(4));
	}
	
	public static int factorial(int i) {
			if(i==0) {
				return 1;
			}else {
				return i*factorial(i-1);
			}
	}

}
