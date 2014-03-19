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

    public void add (int i, String s){
	Node tmp = new Node (s);
	Node temp = new Node (s);
	temp = head;
	for (int x = 0; x < i; x++){
	    temp = temp.getNext();
	}
	temp.setNext(tmp);
    }

    public String get (int i){
	Node tmp = new Node ("temp");
	tmp.setNext(head);
	for (int x = 0; x < i; x++){
	    tmp = tmp.getNext();
		}
	return tmp.getNext();
    }

    public String set (int i, String s){
	Node tmp = new Node (s);
	for (int x = 0; x < i; x++){
	    //finish
    
}