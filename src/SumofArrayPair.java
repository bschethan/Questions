import java.util.ArrayList;

public class SumofArrayPair {

	public static void main(String[] args) {
		int[] a = {3,4,5,2,1,6,1,3};
		int sum  =6;
		sumofArraypair(a,sum);
	}

	public static void sumofArraypair(int[] a, int sum) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int temp = sum-a[i];
			if(al.contains(temp)) {
				System.out.println(temp+"-----"+a[i]);
			}
			al.add(a[i]);
		}
	}
}
