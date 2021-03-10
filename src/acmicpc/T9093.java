package acmicpc;


import java.io.IOException;
import java.util.Scanner;

class Stack<T>{
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data=data;	
		}
	}
		
	private Node<T> top;
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
		
	}
	public T pop() {
		T item =top.data;
		top = top.next;
		return item;
	}
	public boolean isEmpty() {
		return top == null;
	}
	
	
	
}
public class T9093 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Stack<Character> stack = new Stack<Character>();
		sc.nextLine();
		
		while(num-- > 0) {
			String input = sc.nextLine()+" ";
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == ' ') {
					while(!stack.isEmpty()) {
						System.out.print(stack.pop());
					}
					System.out.print(" ");
				} else
					stack.push(input.charAt(i));
			}
			System.out.println();
		}
		
		sc.close();
		return;
	}
}
