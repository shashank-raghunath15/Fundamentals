package org.shashank.dataStructures.stack;

/**
 * 
 * @author shash
 *
 */
public class PostFixToInFix implements ExpressionConvertor {

	/**
	 * @throws Exception 
	 * 
	 */
	@Override
	public String convert(String s) throws Exception {
		StackArray<String> stack = new StackArray<String>(String.class, s.length());

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (c == '*' || c == '/' || c == '+' || c == '-') {
				String s2 = stack.pop();
				String s1 = stack.pop();
				stack.push(s1 + c + s2);
			} else {
				stack.push(String.valueOf(c));
			}
		}
		return stack.pop();
	}

}
