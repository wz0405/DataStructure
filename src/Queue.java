import java.util.NoSuchElementException;

class QueueImple<T>{
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data=data;
		}
	}
	private Node<T> first;
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		if(last != null) {
			last.next=t;
		}
		last = t;
		if(first == null) {
			first=t;
		}
	}
	public T remove() {
		if (first ==null) {
			throw new NoSuchElementException();
		}
		T data = first.data;
		first = first.next;
		
		if(first == null) {
			last = null;
		}
		return data;
	}
	public T peek() {
		if (first == null) {
			throw new NoSuchElementException();
		}else {
			return first.data;
			
		}
	}
	public boolean isEmpty() {
		return first ==null;
		
	}
}


public class Queue {

	public static void main(String[] args) {
	
		QueueImple<Integer> q = new QueueImple<Integer>();
		
		q.add(1);
		System.out.println(q.remove());
		q.add(31);
		System.out.println(q.peek());
	}

}
