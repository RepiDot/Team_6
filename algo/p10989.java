package algo;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class p10989 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		int temp=0;
		int N = scan.nextInt();
		int[] array = new int[N];
		for(i=0; i<N; i++) {
			array[i] = scan.nextInt();
		}
		for(i=0; i<array.length-1; i++) {
			for(int k=i; k<array.length-1; k++) {
				if(array[i]>array[k+1]) {
					temp=array[i];
					array[i]=array[k+1];
					array[k+1]=temp;
				}
			}
		}
		for(i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	private void qSort(int x[]) {
		int lo=x[1];
		int hi=x[x.length-1];
		int pivot=x[0];
		int su=0;
		ArrayList least = new ArrayList();
		ArrayList best = new ArrayList();
		for( ; ; ) {
			int temp =0;
			for(int i=0; i<x.length; i++) {
				if(lo>x[i]&&pivot>lo) {
					temp = lo;
					lo = x[i];
					x[i] = temp;
				}
			}
			for(int i=x.length-1; i>1; i++) {
				if(hi<x[i]&&pivot<hi) {
					temp = hi;
					hi =x[i];
					x[i] = temp;
				}
			}
			if(lo>pivot&&hi<pivot&&Arrays.asList(x).indexOf(lo)!=Arrays.asList(x).indexOf(hi)) {
				temp=lo;
				lo=hi;
				hi=temp;
			}
			if(Arrays.asList(x).indexOf(lo)-Arrays.asList(x).indexOf(hi)==-1) {
				temp=lo;
				lo=pivot;
				pivot=temp;
				break;
			}
		}
		for(int i=0; i<=Arrays.asList(x).indexOf(pivot); i++) {
			least.add(i,x[i]);
		}
		for(int i=Arrays.asList(x).indexOf(pivot)+1; i<x.length; i++) {
			least.add(i,x[i]);
		}
		qSort(least);
		qSort(best);
	}
}