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

    TreeMap <Integer, Double> temp = new TreeMap <Integer, Double> ();

    RandomTreeMapInsert(temp, 1, 10);

    System.out.println(temp);

    }

    public static void RandomTreeMapInsert(TreeMap<Integer, Double> tmp, int num, int range){
	for (int i = 0; i < num; i++){
	tmp.put(i,Math.random() * range);
	}
	System.out.println(tmp);
    }
}