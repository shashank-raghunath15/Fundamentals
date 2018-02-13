package org.shashank.dataStructures.stack;

import java.util.Scanner;

public class InfixToPostFix {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		Stack<Character> stack = new Stack<Character>(Character.class, input.length());

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (c == ' ') {
				continue;
			}
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				Character x;
				while ((x = stack.pop()) != '(') {
					buffer.append(x);
				}
			} else if (c == '*' || c == '/') {
				if (stack.isEmpty()) {
					stack.push(c);
				} else {
					while (!stack.isEmpty()) {
						if (stack.peek() == '*' || stack.peek() == '/') {
							buffer.append(stack.pop());
						} else {
							break;
						}
					}
					stack.push(c);
				}
			} else if (c == '+' || c == '-') {
				if (stack.isEmpty()) {
					stack.push(c);
				} else {
					while (!stack.isEmpty()) {
						if (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-') {
							buffer.append(stack.pop());
						} else {
							break;
						}
					}
					stack.push(c);
				}
			} else {
				buffer.append(c);
			}
		}

		while (!stack.isEmpty()) {
			buffer.append(stack.pop());
		}

		System.out.println(buffer.toString());
		in.close();
	}

}
