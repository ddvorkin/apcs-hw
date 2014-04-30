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

    public void delete(int x){
	Node current = root;
	Node dummy = root;
	while (dummy != search(x)){
	    current = dummy;
	    if (search(x) < dummy){
		dummy = dummy.getLeftData;
	    }
	    else if (search(x) > dummy){
		dummy = dummy.getRightData;
	    }
	}
	if (search(x).getLeftData == null && search(x).getRightData == null){
	    if (dummy < current){
		current.setLeftData(null);
	    }
	    else if (dummy > current){
		current.setRightData(null);
	    }
	}
    }

    public void print (Node n){
	if (n == null)
	    return;
	else {
	    print(n.getLeft());
	    System.out.println(n.getData());
	    print(n.getRight());
	}
    }
}

/* Pre order traversal:
process node
traverse (left)
traverse (right)

In Order traversal:
traverse (left)
process node
traverse (right)

Postorder transversal
traverse (left)
traverse (right)
process node