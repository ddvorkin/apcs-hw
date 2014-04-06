public class myLLIterator<E> implements Iterator<E>{
    private Node currentNode; 
    public myLLIterator<E> (Node n){
	currentNode = n;
    }
    public boolean hasNext(){
	return currentNode.getNext() != null;
    }
    public E next() {
	return currentNode.getNext();
    }
    public void remove(){
    }
}