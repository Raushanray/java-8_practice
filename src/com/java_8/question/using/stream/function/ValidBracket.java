package com.java_8.question.using.stream.function;

import java.util.Stack;

/*Given a String s containing just the characters '(', ')','{','}','['and ']', determine if the input string is valid.
an input string is valid if
open brackets must be closed by the same type of brackets.
open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


input: s= "()[]{}"
output: true

input: s= "(]"
output: false */
public class ValidBracket {
	public static void main(String[] args) {
		String s = "(]";
		boolean status = validateStringBracket(s);
		System.out.println(s);
		System.out.println(status);

	}

	private static boolean validateStringBracket(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ')') {
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}
			} else if (ch == '}') {
				if (stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			} else if (ch == ']') {
				if (stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(ch);
			}

		}
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}

}
