public class BST {
    private Node root;
    
    public BST() {
	root = null;
    }   

    int search (int x){
	Node p = root;
	int a = 0;
	while (p != null && p.getData() != x)
	    {
		if (p.getData() > x)
		    a = p.getLeftData();
		else{
		    a = p.getRightData();
		}
	    }
	return a;
    }

    public void insert(int x) {
	Node node = new Node(x);
	Node temp = root;
	while ( true ) {
	    if (x == temp.getData() ) 
		break;
	    else if (x < temp.getData()) {
		if (!temp.hasLeft()) {
		    temp.setLeftData(node);
		    break;
		}
		else 
		    temp = temp.getLeftData();
	    }
	    else {
		if (!temp.hasRight()){ 
		    temp.setRightData(node);
		    break;
		}
		else 
		    temp = temp.getRightData();
	    }
	}
    }
    // public Node search2(Node c, int x) {Not sure...
}
