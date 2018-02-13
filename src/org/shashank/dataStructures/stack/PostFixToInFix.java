package org.shashank.dataStructures.stack;

import java.util.Scanner;

public class PostFixToInFix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		Stack<String> stack = new Stack<String>(String.class, input.length());

		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (c == '*' || c == '/' || c == '+' || c == '-') {
				String s2 = stack.pop();
				String s1 = stack.pop();
				stack.push(s1 + c + s2);
			} else {
				stack.push(String.valueOf(c));
			}
		}
		System.out.println(stack.pop());
		in.close();
	}

}
