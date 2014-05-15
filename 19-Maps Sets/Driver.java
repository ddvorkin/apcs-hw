import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

	TreeMap<Integer, String> tm = new TreeMap <Integer, String> ();
	
	tm.put (2, "fries");
	tm.put (5, "chicken");
	tm.put (10, "person");
	
	System.out.println(tm);
	System.out.println(tm.get(10));

    }

    TreeMap <Integer, Integer> temp = new TreeMap <Integer, Integer> ();

    public static void randomTreeMapInsert(TreeMap<Integer, Integer> temp, int num, int range){
	for (int i = 0; i < num; i++){
	temp.put(i,Math.random() * range);
	}
    }
}