public class Node {

    private String data;
    private Node left;
    private Node right;

    public LeftNode(String d) {
	data = d;
	left = null;
    }

    public RightNode(String d){
	data = d;
	right = null;
    }

    public void setRightData(String d) {
	right = d;
    }

    public void setLeftData(String d){
	left = d;
    }

    public String getLeftData() {
	return left;
    }

    public String getRightData(){
	return right;
    }

    public void setNext(Node n){
	next = n;
    }
    public Node getNext() {
	return next;
    }
    public String toString() {
	return ""+data;
    }

}
