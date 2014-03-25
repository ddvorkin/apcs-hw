public class LLDriver3 {

    public static void main(String[] args){
	MyLinkedList3 L = new MyLinkedList3();

	L.addtoend("A");

	L.addtoend("B");

	L.addtoend("C");
	System.out.println(L);
	L.addtoend("D");
	L.set(1, "Apple");

	L.addtoend("E");
	System.out.println(L);

        System.out.println(L.find("Apple"));
    }
}
