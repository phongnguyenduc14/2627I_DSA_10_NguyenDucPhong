package excercises.week03;

import java.util.Stack;
import java.util.Scanner;

public class Balanced_Brackets {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else  if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
            } else  if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
            } else  if (c == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
