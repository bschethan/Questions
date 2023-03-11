package Test;

public class LL {
	
	public static Node Head=null;
	
	class Node{
		private int data;
		private Node next;
		 public Node(int data){
			 this.data = data;
			 this.next = null;
		 }
	}

	public static void main(String[] args) {
		LL ll =new LL();
		ll.createNode(0);
		ll.createNode(1);
		ll.createNode(2);
		ll.createNode(3);
//		ll.showall();
		ll.createNode(4);
//		ll.showall();
		ll.reverse();
		ll.showall();
	}

	public void reverse(){
		Node temp=null,temp2 =null;
		while(Head!=null) {
			temp2 = Head.next;
			Head.next =temp;
			temp =Head;
			Head =temp2;		
		}
		Head = temp;
		
	}
	
	public void showall() {
		Node current = Head;
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	public void createNode(int a) {
		if(Head==null) {
			Head = new Node(a);
		}else {
			Node current = Head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = new Node(a);
		}
	}
}
