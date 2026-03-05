package com.Palindrome;
import java.util.*;

public class UCsix{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Enter input
		System.out.println("Enter String: ");
		String input = sc.next();
		
		int n = input.length();
		
		System.out.println("Input String: " + input);
		
		char[] chars = input.toCharArray();
		
		boolean pal = true;
		
		//stack declaration
		Stack<Character> st = new Stack<>();
		
		//queue declaration
		Queue<Character> q = new LinkedList<>();
		 
		
		//push
		int i = 0;
		while(i < n) {
			st.push(chars[i]);
			q.add(chars[i]);
			i++;
		}
		
		//pop 
		for(int r = 0; r < n; r++) {
			char stackchar = st.pop();
			char queuechar = q.poll();
			
			if(stackchar != queuechar){
				pal = false;
				break;
			}
			
		}
		
		
		System.out.println("Is Palindrome: " + pal);
		sc.close();
	
	}
}