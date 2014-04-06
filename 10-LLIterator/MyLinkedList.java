public class MyLinkedList<E> implements Iterable {
    private Node head;
    private int length = 0;

    public Iterator<E> iterator(){
	Iterator<E> it = new myLLIterator<E>(head);
	return it;
    }

    public MyLinkedList() {
        head = new Node("head");
    }


    public String toString() {
        String s = "";
        Node pointer = head;

        for (int x = 0; x < length; x++) {

            s = s + "," + pointer.getData(); //To be completed.
            pointer = pointer.getNext();
        }
        return s;

    }

    public void add(String s) {
        if (length == 0) {
            head=new Node(s);
            length++;
        } else {
            this.add(length, s);
        }

    }

    public void add(int i, String s) {
        if (i == 0) {
            head = new Node(s);

        } else {
            Node pointer = head;

            for (int x = 0; x < i - 1; x++) {
                pointer = pointer.getNext();
            }
            length++;
            pointer.setNext(new Node(s));
        }
    }


    public String get(int i) {
        Node node = head;
        for (int x = 0; x < i; x++) {
            node = node.getNext();
        }
        return node.getData();
    }

      public String set (int i, String s){
    Node node = head;
    String q = "";
	for (int x = 0; x < i; x++){
	    node = node.getNext();
    }
          q = node.getData();
          node.setData(s);
          return q;
      }

   /* public String remove (int i){
        Node node = head;
        for (int x = 0; x <= i; x++){
            node = node.getNext();

            }
        }
    }
     */

    public int find (String s){
        Node node = head;
        for (int x = 0; x < length; x++){
            if (node.getData().equals(s)) {
        return x;
            }
            else{
                node = node.getNext();
            }
        }
        return -1;
        }


    public int length() {
        return length;
    }


}
