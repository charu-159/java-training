import java.util.*;

public class EvaluateRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break; // Java auto truncates toward 0
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    // Driver code
    public static void main(String[] args) {
        EvaluateRPN solver = new EvaluateRPN();

        String[] exp1 = {"2","1","+","3","*"};
        System.out.println(solver.evalRPN(exp1)); // 9

        String[] exp2 = {"4","13","5","/","+"};
        System.out.println(solver.evalRPN(exp2)); // 6

        String[] exp3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(solver.evalRPN(exp3)); // 22
    }
}
