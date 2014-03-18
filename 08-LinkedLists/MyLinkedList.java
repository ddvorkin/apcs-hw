public class MyLinkedList{
    private Node head;

    public MyLinkedList() {
	head = null; //is null by default, so unnecessary
    }

    public void add (String s){
	Node tmp = new Node (s);
	/*
	head = tmp;
	*/
	tmp.setNext(head);
	head = tmp;
    }

    public String toString(){
	String s;
	s = "" + head; //To be completed.
	return s;

    }
    
}