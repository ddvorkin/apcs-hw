public class ArrayStack {

    
    private Object [ ] theArray;
    private int        topOfStack;

    public ArrayStack( ) {
        theArray = new Object[10];
        topOfStack = -1;
    }

    public void pop(){
        if(topOfStack == -1)
	    topOfStack--;
    }
    public void push(Object x){
        if( topOfStack + 1 == theArray.length )
            doubleArray( );
        theArray[ ++topOfStack ] = x;
    }
    private void doubleArray( ) {
        Object [ ] newArray;
        
        newArray = new Object[ theArray.length * 2 ];
        for( int i = 0; i < theArray.length; i++ )
            newArray[ i ] = theArray[ i ];
        theArray = newArray;
    }

}
