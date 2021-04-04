package acmicpc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class T1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		int index = p-1;
		int x = 0;
		
		Queue<Integer> inputList = new LinkedList<Integer>();
		List<Boolean> ckList = new ArrayList<Boolean>();
		List<Integer> resultList = new ArrayList<Integer>();
		for(int i=1 ;i<n+1;i++) {
			inputList.offer(i);
			
		}	
		while (inputList.size() > 1) {
            for (int j = 1; j < p; j++) {
            	inputList.offer(inputList.poll());
            }

            resultList.add(inputList.poll());
        }
			
		
		System.out.println(resultList);
		
	}
	
}
