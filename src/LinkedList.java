
class Node{
	int data;
	Node next = null;
	Node (int d){
		this.data = d;
		
	}
	void append(int d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next!=null) {
			n=n.next;
		}
		n.next = end;
	}
	//첫번째 값은 삭제불가
	void delete(int d) {
		Node n = this;
		while(n.next!=null) {
			if(n.next.data==d) {
				n.next=n.next.next;
			}else {
				n=n.next;
			}
		}
	}
	void view() {
		Node n = this;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}

public class LinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.append(2);
		head.append(3);
		head.append(4);
		
		head.view();
		
		head.delete(2);
		head.view();
		head.delete(1);
		head.view();
	}
}
