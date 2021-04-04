package acmicpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T17413 {
	public static void main(String[] args) {
		boolean ck = false;
		boolean nomal = false;
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		
		StringBuilder sb = new StringBuilder();
		List<Character> taskList = new ArrayList<>();

		for(int n=0; n<str.length(); n++) {
			Character c = str.charAt(n);
			if(c == '<') {
				if(taskList.size()>0) {
					Collections.reverse(taskList);
					for(int j = 0 ; j< taskList.size();j++) {
						sb.append(taskList.get(j));
					}
					taskList.clear();
				}
				nomal = false;
				ck = true;
				sb.append(c);
			}else if(c == '>') {
				ck = false;
				sb.append(c);
			}else if(ck==false) {
				if(c == ' ') {
					Collections.reverse(taskList);
					for(int j = 0 ; j< taskList.size();j++) {
						sb.append(taskList.get(j));
					}
					sb.append(' ');
					taskList.clear();				
				}else {
					taskList.add(c);
				}
				nomal = true;
				
			}else if(ck==true && nomal == false) {
				sb.append(c);
			}
		}
		
		Collections.reverse(taskList);
		for(int j = 0 ; j< taskList.size();j++) {
			sb.append(taskList.get(j));
		}
		sb.append(' ');
		System.out.println(sb.toString());
		
	}
}
