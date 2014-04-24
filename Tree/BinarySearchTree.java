public Class BinarySearchTree{
    private node root;

    int search (int x){
	node p = root;
	while (p != null && p.getData() != x)
	    {
		if (p.getData() > x)
		    p = p.getLeft();
		else{
		    p = p.getRight();
		}
	    }
	return p;
    }

    node search (node P, int x){
	


    }

    void insert (node x){
	node p = root;
	while (p != null){
	    if (p.getData() > x)
		p = p.getLeft();
	    else {
		p = p.getRight();
	    }
	    p.setnext(x);
	}
    }
}