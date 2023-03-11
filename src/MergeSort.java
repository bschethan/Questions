
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a11 = {3,6,8,10,12};
		int [] a2 = {1,4,7,9,11,15,21};
		 int [] a3 =mergeSort(a11,a2);
		 for(int a:a3) {
			 System.out.println(a);
		 }
	}

	public static int[] mergeSort(int a[], int b[]) {
		int i=0,j=0,k=0;
		int alen = a.length;
		int blen = b.length;
		int[] c = new int[alen+blen];
		while(alen>i && blen>j) {
			if(a[i]>b[j]) {
				c[k++] = b[j++];
			}else {
				c[k++] = a[i++];
			}
		}
		while(alen>i) {
			c[k++] = a[i++];
		}
		while(blen>j) {
			c[k++] = b[j++];
		}
		return c;
	}
}
