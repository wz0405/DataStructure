package acmicpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T17298 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String str = sc.nextLine();
		str = str.replace(" ", "");
		String result = "";
		boolean ckBig = false;
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<str.length() ; i++) {
			
			list.add(str.charAt(i)-'0');
		}
		for (int j=0; j<list.size()-1; j++) {
			boolean ck = false;
			int large = 0;
			for(int k=j+1; k<list.size() ;k++) {
				if(list.get(j)<list.get(k) && ck == false) {
					large = list.get(k);
					list.set(j, large);
					ck=true;
				}
			}
			
			
		}
		if(list.size()>0) {
			list.set(list.size()-1, -1);
			if (Collections.max(list)==list.get(0)) {
				list.set(0, -1);
			}
		}
		for(int i=0; i<list.size();i++) {
			result+=list.get(i);
			result+=" ";
		}
		System.out.println(result);
	
	}

}
