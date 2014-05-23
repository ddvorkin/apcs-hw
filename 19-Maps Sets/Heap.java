import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {
    
    public static void main(String[] args){

        Comparator<String> compare = new StringLengthComparator();
        PriorityQueue<String> heap = 
            new PriorityQueue<String>(10, comparator);
        heap.add("middle");
        heap.add("looooooooooooooonnnnnngggggggg");
        heap.add("sml");
        while (heap.size() != 0){
	    System.out.println(heap.remove());
	}
    }
}
