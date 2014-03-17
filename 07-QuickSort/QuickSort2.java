<<<<<<< HEAD
import java.util.*;
import java.io.*;

public class Qsort2{
    private Random rnd = new Random();

    public int partition(int[] a, int l, int r) {
	int tmp;
	int pIndex = l+rnd.nextInt(r-l);
	int p = a[pIndex];
	tmp = a[r];
	a[r] = a[pIndex];
	a[pIndex]=tmp;

	int swapindex=l;
	for (int i=l;i<r;i++) {
	    if (a[i]<p) {
		tmp = a[i];
		a[i]=a[swapindex];
		a[swapindex]=tmp;
		swapindex++;
	    }
	}
	tmp = a[swapindex];
	a[swapindex]=a[r];
	a[r]=tmp;
	return swapindex;
    }
    
    public void qsort(int[] a, int l, int r) {
	if (r-l <= 1)
	    return;
	else {
	    int pi = partition(a,l,r);
	    if (pi-1>l)
		qsort(a,l,pi-1);
	    if (pi+1<r)
		qsort(a,pi+1,r);

	}
    }
    public void  qsort(int[] a) {
	qsort(a,0,a.length-1);
    }


    public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	Random rnd = new Random();
	int[] a = new int[n];
	for (int i=0;i<n;i++)
	    a[i]=rnd.nextInt(100);
	System.out.println(Arrays.toString(a));
	Qsort2 q = new Qsort2();
	q.qsort(a);
	int p = q.partition(a,0,a.length-1);
	System.out.println("a["+p+"] = "+a[p]);	
	System.out.println(Arrays.toString(a));
    }
    
}   
=======
public class QuickSort2 {

    public int partition (int []a, int L, int R){

	private int p = a[nextInt(a.length)];
	private int si = 0;

	for (int i = L; i < R - 1; i++){

	    if (i < p)
>>>>>>> e67b244375cb1962a41607491ff9e5a59231abc3
