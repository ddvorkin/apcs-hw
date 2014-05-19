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

    HashMap hm = new HashMap();
    hm.put("Apple", new Double(3.8));
    hm.put("Banana", new Double(2.1));
    hm.put("Cantelope", new Double(7.6));
    hm.put("Dewberry", new Double(8.4));
    hm.put("Eggplant", new Double(3.1));
      
    Set set = hm.entrySet();
    Iterator i = set.iterator();
    while(i.hasNext()) {
	Map.Entry me = (Map.Entry)i.next();
	System.out.print(me.getKey() + ": ");
	System.out.println(me.getValue());
    }
}
