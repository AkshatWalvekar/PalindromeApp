package com.Palindrome;

import java.util.*;
public class UCfive {
	public static void main(String[] args) {
		String s="racecar";
		
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			stack.push(s.charAt(i));
		}
		
		boolean isPalindrome=true;
		for(int i=0;i<s.length();i++) {
			char pchar=stack.pop();
			if(s.charAt(i)!=pchar) {
				isPalindrome=false;
				break;
			}
		}
		System.out.println("Input String: " + s);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome ");
        } else {
            System.out.println("Result: It is NOT a Palindrome ");
        }
	}
}
