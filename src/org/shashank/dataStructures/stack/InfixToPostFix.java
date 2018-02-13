package org.shashank.dataStructures.stack;

/**
 * 
 * @author shash
 *
 */
public class InfixToPostFix implements ExpressionConvertor {

	/**
	 * @throws Exception
	 * 
	 */
	@Override
	public String convert(String s) throws Exception {
		StackArray<Character> stack = new StackArray<Character>(Character.class, s.length());

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
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
		return buffer.toString();
	}

}
