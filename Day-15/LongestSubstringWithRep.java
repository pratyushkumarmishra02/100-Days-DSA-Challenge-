package Sem7;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithRep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int maxLen = 1;
		int currentLen =1;
		char c = s.charAt(0);
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)== s.charAt(i-1)) {
				currentLen++;
			}else {
				currentLen = 1;
			}
			if(currentLen>maxLen) {
				maxLen=currentLen;
				c = s.charAt(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<maxLen;i++) {
			sb.append(c);
		}
		System.out.println("MaxLen: "+maxLen);
		System.out.println("The Longest substring is : "+ sb.toString());
		
	}

}
