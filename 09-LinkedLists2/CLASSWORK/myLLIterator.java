public class myLLIterator<E> implements Iterator<E>{
    private Node currentNode; 
    public myLLIterator<E> (Node n){
	currentNode = n;
    }
    public boolean hasNext(){
	return false;
    }
    public E next() {
	return null;
    }
    public void remove(){
    }
}