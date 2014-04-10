import java.io.*;
import java.util.*;

public class Driver {
    
    public static void main(String[] args){
	MyQueue q = new MyQueue();
	String s;
	System.out.println(q);
	q.enqueue("first");
	System.out.println(q);
	q.enqueue("second");
	System.out.println(q);
	q.enqueue("third");
	System.out.println(q);
	System.out.println("Front: "+q.front());
	System.out.println(q.length());
	s = q.dequeue();
	System.out.println(s+"  | "+q);
	s = q.dequeue();
	System.out.println(s+"  | "+q);
	s = q.dequeue();
	System.out.println(s+"  | "+q);
	s = q.dequeue();
	System.out.println(s+"  | "+q);
    }

}
