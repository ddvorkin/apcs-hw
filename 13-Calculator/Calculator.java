import java.util.*;
import java.io.*;

public class Calculator {

    private ArrayStack a;

    public boolean function(String x) {
        return (x.equals("+") || x.equals("-") || x.equals("*") || x
                .equals("/"));
    }

    public Calculator(){
	a = new ArrayStack();
    }

    public void calc(){
        String x;
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scan = new Scanner(x);

        while (scan.hasNext()) {
            x = scan.next();

            if (function(x)) {
		Integer termA = Integer.parseInt(stack.pop());//Needs fix
		Integer termB = Integer.parseInt(stack.pop());//Needs fix
                if (stack.size() > 1) {
                    if (x.equals("+")) {
                        stack.push((Integer) stack.pop() + (Integer) stack.pop());
                    } else if (x.equals("-")) {
                        stack.push((Integer) stack.pop() + (Integer) stack.pop());
                    } else if (x.equals("*")) {
                        stack.push((Integer) stack.pop() * (Integer) stack.pop());
                    } else if (x.equals("/")) {
                        double one = stack.pop();
                        double two = stack.pop();

                    }
                }
		else {
		    stack.push(x);
		}
            }
        }
    }

    public static void main (String [] args){
	Calculator calc = new Calculator();
      calc.calc();
    }
}

//A lot of help from Nick Romanoff.