package acmicpc;

import java.util.EmptyStackException;
import java.util.Scanner;


class Stackimple<T>{
	
	class Node<T>{
		private T data;
		private Node<T> next;
		
		
		//노드 메서드를 통해 값 저장
		public Node(T data) {
			this.data=data;
		}
	}
	private int cnt=0;
	private Node<T> top;
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next= top;
		top = t;
		cnt++;
	}
	public int pop() {
		if(top == null) {
			return -1;
		}
		T item =top.data;
		top = top.next;
		return (int)item;
		
	}
	public int size() {
		
		if(cnt==0) {
			return 0;
		}else {
			return cnt;
		}
	}
		
	
	public int empty() {
		if(top ==null) {
			return 1;
		}else {
			return 0;
		}
	}public int top() {
		if(top==null) {
			return -1;
		}else {
			return (int)top.data;
		}
	}
}

public class T10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stackimple<Integer>  s = new Stackimple<Integer>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
            String str = sc.next();
            if (str.equals("push")) {
                int addNumber = sc.nextInt();
                s.push(addNumber);
            }
            else if (str.equals("pop")) {
                System.out.println(s.pop());
            }
            else if (str.equals("size")) {
                System.out.println(s.size());
            }
            else if (str.equals("empty")) {
                System.out.println(s.empty());
            }
            else if (str.equals("top")) {
                System.out.println(s.top());
            }
        }
        sc.close();
		
	}
}
