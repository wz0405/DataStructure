package acmicpc;

import java.util.Scanner;

class Stack2<T> {
	
	class Node<T>{
		private T data;
		private Node<T> next;
	
		public Node(T data){
			this.data = data;

		}
	}
	private Node<T> top;
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next=top;
		top=t;
	}
	public Character pop() {
		if(top==null) {
			return 'n';
		}
		T t = top.data;
		top = top.next;
		return (Character)t;
		
	}
	public T top() {
		return top.data;
	}
	public boolean isEmpty() {
		return top == null;
	}
}


public class T9012 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack2<Character> s = new Stack2<Character>();
		
		int left = 0;
		int right = 0;
		String answer = "";
		for(int i=0; i<N ; i++) {
			String str = sc.next();
			for(int j=0; j<str.length();j++) {
				if(s.isEmpty()) {
					System.out.println("NO");
					return;
				}
				if(str.charAt(j)=='(') {
					s.push(str.charAt(j));
					left++;
				}else if(str.charAt(j)==')') {
					if(s.top()=='(') {
						s.pop();
					}
					right++;
				}
				if(left!=right) {
					answer = "NO";
				}
				
			}
			if(s.isEmpty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		
		}

	}

}
