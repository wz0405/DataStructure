package acmicpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T1406 {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int N = sc.nextInt();
		
		for(int i=0;i<str.length();i++) {
			list.add(str.charAt(i));
		}
		
		int cursur = str.length();
		
		for(int j=0; j<N; j++) {
			String st = sc.next();
			if(st.charAt(0)=='L') {
				if(cursur>0) {
					cursur--;
				}else {
					continue;
				}
			}else if(st.charAt(0)=='D') {
				if(cursur<str.length()) {
					cursur++;
				}else {
					continue;
				}
			}else if(st.charAt(0)=='B') {
				if(cursur>0) {
					list.remove(cursur-1);
				}
				
			}else {
				if(cursur==str.length()) {
					list.add(st.charAt(0));
				}else if(cursur!=0){
					list.add(cursur+1, st.charAt(0));
				}else {
					list.add(cursur, st.charAt(0));
				}
			}
			
		}
		System.out.println(list.toString());
		
	}
}
