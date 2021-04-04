package acmicpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class T10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ckcnt = 0;
		int laserCnt = 0;
		int result = 0;
		
		Stack<Character> stack = new Stack<>();
		List<Character> list = new ArrayList<Character>();
		
		str = str.replace("()", "x");
		for (int i=0; i<str.length();i++) {
			
			Character c = str.charAt(i);
			list.add(c);
		}
		for (int i=0; i<list.size();i++) {
			if(list.get(i)=='(') {
				ckcnt++;
				result++;
			}else if(list.get(i)=='x') {
				if(ckcnt!=0) {
					laserCnt++;
					result += laserCnt * ckcnt;
					laserCnt=0;
				}
			}
			else if(list.get(i)==')') {
				ckcnt--;
			}
			
		}
		System.out.println(result);
			
		}
	}

