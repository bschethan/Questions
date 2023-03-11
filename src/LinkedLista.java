public class LinkedLista{
	
	public static Node head;
	private static class Node{
		private int data;
		private Node next;
		
		
		public Node(int a) {
			this.data = a;
			this.next = null;
		}
	}
	
	public static void main(String [] args) {
		addList(0);
		addList(1);
		addList(2);
		addList(3);
		addList(4);
		addList(5);
		showallList();
		System.out.println("---------------reverse------------");
		reverse();
		showallList();
	}
	public static void addList(int a) {
		if(head ==null) {
			head = new Node(a);
		}else {
			Node current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = new Node(a);
		}
	}
	
	public static void showallList() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data);
			current =current.next;
		}
	}
	
	public static void reverse() {
		Node temp = null;
		Node temp2;
		while(head!=null) {
			 temp2 = head.next;
			 head.next = temp;
			 temp =head;
			 head=temp2;
		}
		head= temp;
		
	}
}