public class LLDriver3 {

    public static void main(String[] args){
	MyLinkedList3 L = new MyLinkedList3();

	L.add("A");

	L.add("B");

	L.add("C");
	System.out.println(L.get(1));
	L.add("D");
	L.set(1, "Apple");

	L.add("E");
	System.out.println(L);

        System.out.println(L.find("Apple"));
    }
}
