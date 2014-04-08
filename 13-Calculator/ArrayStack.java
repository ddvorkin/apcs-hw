public class ArrayStack {

    
    private Object [] theArray;
    private int topOfStack;

    public ArrayStack( ) {
        theArray = new Object[10];
        topOfStack = -1;
    }

    private void pop(){
        if(topOfStack == -1)
	    topOfStack--;
    }
    private void push(Object x){
        if( topOfStack + 1 == theArray.length )
            grow();
        theArray[++topOfStack] = x;
    }

    public Object peek(){
	return theArray[topOfStack];
    }

    private void grow() {
        Object [ ] newArray;
        newArray = new Object[theArray.length * 2];
        for( int i = 0; i < theArray.length; i++ )
            newArray[i] = theArray[i];
        theArray = newArray;
    }
    //Fixed grow with help from Nick.

}
