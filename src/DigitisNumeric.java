
public class DigitisNumeric {

	public static void main(String[] args) {
		String a = "1234576fdsafsh";
		for(int i=0;i<a.length();i++) {
			if(Character.isDigit(a.charAt(i))) {
				System.out.println(a.charAt(i)+" is a Numeric");
			}else {
				System.out.println(a.charAt(i)+" is not a Numeric");
			}
		}
	}

}
