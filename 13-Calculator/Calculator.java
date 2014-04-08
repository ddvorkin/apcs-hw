import java.util.*;
import java.io.*;

public class Calculator {

    private static MyStack a = new MyStack();

    public static boolean function(String x) {
        return (x.equals("+") || x.equals("-") || x.equals("*") || x
                .equals("/"));
    }

    public static double calc(String input){
        String x;
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scan = new Scanner(input);

        while (scan.hasNext()) {
            x = scan.next();

            if (function(x)) {
                if (stack.size() > 1) {
                    if (x.equals("+")) {
                        stack.push((Integer) stack.pop() + (Integer) stack.pop());
                    } else if (x.equals("-")) {
                        stack.push(-(Integer) stack.pop() + (Integer) stack.pop());
                    } else if (x.equals("*")) {
                        stack.push((Integer) stack.pop() * (Integer) stack.pop());
                    } else if (x.equals("/")) {
                        double one = stack.pop();
                        double two = stack.pop();

                    }
                }
            }
        }
        return (Integer) stack.pop();

    }

    public static void main (String [] args){
        System.out.println(calc("5 6 *"));
    }
}
