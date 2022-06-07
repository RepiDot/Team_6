package algo;

import java.util.Arrays;
import java.util.*;

class Search {
	public static boolean binarySearch(int Find, int[] A) {
		int mid;
		int left = 0;
		int right = A.length -1;
		
		while(right>=left) {
			mid = (right + left) /2;
			if(Find==A[mid]) {
				return true;
			}
			if(Find<A[mid]) {
				right = mid -1;
			}else {
				left = mid +1;
			}
		}
		return false;	
	}
}

public class p1920 extends Search {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int N = scan.nextInt();
		int[] A = new int[N];
		for(int k=0; k<N; k++) {
			A[k] = scan.nextInt();
		}
		Arrays.sort(A);
		int M = scan.nextInt();
		int[] B = new int[M];
		for(int i =0; i<M; i++) {
			B[i] = scan.nextInt();
		}
		
		for(int i=0; i<M; i++) {
			if(binarySearch(B[i],A)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		
	}
}