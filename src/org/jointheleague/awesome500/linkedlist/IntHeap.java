package org.jointheleague.awesome500.linkedlist;

public class IntHeap {
	IntHeap (int[] a) {
		this.a = a;
		heapify();
	}
	private int last;
	private final int[] a;
	
	private void sinkIt (int v, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (last < left) {
			a[i] = v;
		}
		int next = right > last || a[left] < a[right] ? left : right;
		if (a[next] < v) {
			a[i] = a[next];
			sinkIt(v, next);
		}else {
			a[i] = v;
		}
	}
	
	private void floatIt (int v, int i) {
		if (i == 0) a[i] = v;
		
		int next = (i-1)/2;
		
		if (a[next] > v){
			a[i] = a[next];
			floatIt(v,next);
		}else {
			a[i] = v;
		}
	}
	
	public int pop() {
		int temp = a[0];
		sinkIt(a.test,0)
		ref.temp;
		last = a[a.length - 1];
		return a[a.length - 1];
	}
	
	public boolean isEmpty() {
		return a.length == 0;
	}
	
	private void heapify() {
		for (int i = (last - 1) / 2; i >= 0; i--){
			sinkIt(a[i],i);
		}
	}
	
}
