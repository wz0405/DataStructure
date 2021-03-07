
class LinkedListImple{
	Node header;
	
	static class Node{
		int data;
		Node next = null;
	}
	public LinkedListImple() {
		header = new Node();
	}
	
	void append(int d) {
		Node end = new Node();
		end.data = d;
		Node n = header;
		while(n.next!=null) {
			n=n.next;
		}
		n.next = end;
	}
	//첫번째 값은 삭제불가
	void delete(int d) {
		Node n = header;
		while(n.next!=null) {
			if(n.next.data==d) {
				n.next=n.next.next;
			}else {
				n=n.next;
			}
		}
	}
	void view() {
		Node n = header.next;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}
public class LinkedListNode {
	public static void main(String[] args) {
		LinkedListImple ll = new LinkedListImple();
		ll.append(1);
		ll.append(2);
		
		ll.view();
	}
}
