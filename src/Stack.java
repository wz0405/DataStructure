import java.util.EmptyStackException;

class Stackimple<T>{
	
	class Node<T>{
		private T data;
		private Node<T> next;
		
		
		//노드 메서드를 통해 값 저장
		public Node(T data) {
			this.data=data;
		}
	}
	
	private Node<T> top;
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		T item =top.data;
		top = top.next;
		return item;
		
	}
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
		
	}
	public T peek() {
		if (top == null) {
			throw new EmptyStackException();
			
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	
}

	
public class Stack {

	public static void main(String[] args) {
		Stackimple<String>  s = new Stackimple<String>();
		
		s.push("j");
		s.push("i");
		s.push("s");
		s.push("u");
		
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		
		
		//LIFO
		
		
	}

}
