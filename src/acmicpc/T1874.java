package acmicpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Stack1874<T>{
	class Node<T>{
		private T data;
		private Node<T> next;
		
		private Node(T data){
			this.data = data;
			
		}
	}
	private Node<T> top;
	
	public void push(T data) {
		Node<T> t = new Node<T>(data);
		t.next = top;
		top = t;
	}
	public T pop() {
		T item =top.data;
		top = top.next;
		return item;
	}
	public T top() {
		T t = top.data;
		return t;
	}
	public boolean isEmpty() {
		return top == null;
	}
}
public class T1874 {
	public static void main(String[] args) {
		
	
		List<Integer> inputList = new ArrayList<Integer>();
		List<String> resultList = new ArrayList<String>();
		Stack1874<Integer> s = new Stack1874<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N ; i++) {
			int putnum = sc.nextInt();
			inputList.add(putnum);
		}
		for(int k=1; k<N+1 ; k++) {
			s.push(k);
			System.out.println("+");
			while(inputList.get(0)==s.top()) {
				s.pop();
				inputList.remove(0);
				System.out.println("-");
			}
		}
		if(! s.isEmpty()) {
			resultList.clear();
			resultList.add("NO");
		}
		System.out.println(resultList.toString());
	}
	

}
