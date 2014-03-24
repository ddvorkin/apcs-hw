public class MyLinkedList3 {
    private Node head;
    private Node tail;
    private int length = 0;

    public MyLinkedList3() {
        head = null; //is null by default, so unnecessary
	tail = null;
    }


    public String toString() {
        String s = "";
        Node pointer = head;

        for (int x = 0; x < length; x++) {

            s = s + "," + pointer.getData();
            pointer = pointer.getNext();
        }
        return s;

    }

    public void addToEnd(String s) {
        if (length == 0) {
            head = new Node(s);
            length++;
        } else {
            this.add(length, s);
        }

    }

    public void add(int i, String s) {
        if (i == 0) {
            head = new Node(s);
	    tail = get(i-1);
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
    } Not sure how to remove.
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
