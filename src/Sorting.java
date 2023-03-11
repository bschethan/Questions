
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,1,5,90,3,56,87};
		selectionSort(a);

	}
	
	
	public static void insertionSort(int[] a) {
		int p =0;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			temp = a[i];
			for(int j=i;j<a.length;j++) {
				if(a[j]<temp) {
					temp = a[j];
					p =j;
				}
			}
			a[p] = a[i];
			a[i] = temp;
		}
		for(int b :a) {
			System.out.println(b);
		}
	}
	
	public static void selectionSort(int a[]) {
		int temp =0,p=0;
		for(int i=0;i<a.length;i++) {
			temp = a[i];
			for(int j=i;j<a.length;j++) {
				if(a[j]>temp) {
					continue;
				}else {
					temp = a[j];
					p=j;
				}
			}
			a[p] = a[i];
			a[i] = temp;
		}
		for(int b :a) {
			System.out.println(b);
		}
	}
	
	public static void bubblesort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				int temp = a[i];
				if(a[i]<a[j]) {
					a[i] = a[j];
					a[j] =temp;
				}
			}
		}
		for(int b :a) {
			System.out.println(b);
		}
	}

}
