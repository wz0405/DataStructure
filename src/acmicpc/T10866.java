package acmicpc;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class T10866 {
	public static void main(String[] args) {
		
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			String str = sc.nextLine();
			String ckStr = str.split(" ")[0];
			String ckNum = str.split(" ")[1];
			if(ckStr=="push_back") {
				deque.addLast(null);
			}
		}
				
				
	}

	
}
