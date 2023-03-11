package Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isBalancedPara("([{}]"));
//		isBalanced("{wqewe][1323edsdsqdsqdqdw3e2we2e]90");
		int [] a = {3,6,8,10,12};
//		int [] b = {1,4,7,9,11,15,21};
//		MergeSort(a,b);
//		int [] a = {10,1,5,90,3,56,87};
//		bubblesort(a);
		System.out.println(binarySearch(a,0,a.length-1,12));
	}

	
	public static int binarySearch(int[] a, int s,int l,int Key) {
		if(s>l) {
			return -1;
		}
		int mid  = (s+l)/2;
		
		if (a[mid]==Key) {
			return 1;
		}
		
		if(Key>=a[s] && Key<a[mid]) {
			return binarySearch(a, s, mid-1, Key);
		}else if (Key>=a[mid] && Key <=a[l]) {
			return binarySearch(a, mid+1, l, Key);
		}
		return 0;
	}
	public static boolean isBalancedPara(String a) {
		Deque<Character> stack  = new ArrayDeque<Character>();
		char[] achar  = a.toCharArray();
		for(int i=0;i<achar.length;i++) {
			if(achar[i]=='{' || achar[i]=='[' || achar[i]=='(') {
				stack.push(achar[i]);
			}
			char check;
			switch(achar[i]) {
			case '}' :
					 check = stack.pop();
					if(check==achar[i]) {
						return false;
					}
					break;
					
			case ']' :
					 check = stack.pop();
					if(check==achar[i]) {
						return false;
					}
					break;
					
			case ')' :
				check = stack.pop();
				if(check==achar[i]) {
					return false;
				}
				break;
					
			}
			if(stack.isEmpty()) {
				return true;
			}
		}
		return false;
	}
	public static void MergeSort(int[] a,int [] b) {
		int i=0,j=0,k=0;
		int [] c = new int[a.length+b.length];
		int alen = a.length;
		int blen = b.length;
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
		for(int d :c) {
			System.out.println(d);
		}
		
	}
	
	
	public static void bubblesort(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				int temp = a[i];
				if(a[i]<a[j]) {
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int g:a) {
			System.out.println(g);
		}
	}
	
	public static void bubblesort1(int[] a) {
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
	public static void isBalanced(String a) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] achar = a.toCharArray();
		for(int i=0;i<achar.length;i++) {
			if(!(Character.isAlphabetic(achar[i]) || Character.isDigit(achar[i]))) {
				if(map.containsKey(achar[i])) {
					map.put(achar[i], map.get(achar[i])+1);
				}else {
					map.put(achar[i], 1);
				}
			}
		}
		
		Set<Entry<Character,Integer>> entry   = map.entrySet();
		for(Entry<Character,Integer> e : entry) {
			if(!(e.getValue()%2 == 0)) {
				System.out.println("Pranthisis are not balanced "+ e.getKey());
				
			}
		}
	}
	public static boolean isAnagram(String a, String b) {
		char [] a1 = a.toLowerCase().toCharArray();
		char[] b1 = b.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		return Arrays.equals(a1, b1);
		
	}
	public static boolean isAmstrongNumber(int a) {
		int data =a;
		int r,temp=0;
		while(a>0) {
			r = a%10;
			temp =temp +(r*r*r);
			a =a/10;
		}
		if(data ==temp) {
			return true;
		}else {
			return false;
		}
	}
}
