package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Queue10845<T>{
	int cnt=0;
	class Node<T>{
		private T data;
		private Node<T> next;
		
		private Node(T data){
			this.data=data;
		}
	}
	private Node<T> first;
	private Node<T> last;
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		
		if(last!=null) {
			last.next=t;
		}
		last = t;
		cnt++;
		if(first==null) {
			first=t;
		}
	}
	public int pop() {
		
		if(first!=null) {
			cnt--;
			T t = first.data;
			first=first.next;
			return (int)t;
		}
		else if(first == null) {
			last = null;
			return -1;
		}else {
			last=null;
			return -1;
		}
	}
	public int size() {
		return cnt;
	}
	public int empty() {
		if(cnt>0) {
			return 0;
		}else {
			return 1;
		}
	}
	public int front() {
		if(first!=null) {
			T t = first.data;
			return (int)t;
		}else {
			return -1;
		}
	}
	public int back() {
		if(last!=null) {
			T t = last.data;
			return (int)t;
		}else {
			return -1;
		}
	}
	public boolean isEmpty() {
		return first ==null;
		
	}
	
}
public class T10845 {
	public static void main(String[] args) throws IOException{
		Queue10845<Integer> queue= new Queue10845<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //명령의 수 
  
        while(n-->0) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            String temp =st.nextToken(); //명령어
            switch(temp) {
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));  
                    break;
                case "pop":   
                	System.out.println(queue.pop());
                	break;
                case "empty":
                	System.out.println(queue.empty());
                	break;
                case "size":
                	System.out.println(queue.size());
                	break;
                case "front":
                	System.out.println(queue.front());
                	break;
                case "back":
                	System.out.println(queue.back());
                	break;
            }
        }
          
	}

}
