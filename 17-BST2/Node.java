public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int d) {
	data = d;
    }

    public void setRightData(Node d) {
	right = d;
    }

    public void setLeftData(Node d){
	left = d;
    }

    public int getData(){
	return data;
    }

    public boolean hasLeft() {
	return left == null;
    }

    public boolean hasRight() {
	return right == null;
    }

    public Node getLeftData() {
	return left;
    }

    public Node getRightData(){
	return right;
    }

    public String toString() {
	return ""+data;
    }

}
