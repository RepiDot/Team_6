package algo;

import java.util.*;

public class p2693 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int N = scan.nextInt();
		for(int i=0; i<N; i++) {
			for(int k =0; k<10; k++) {
				A[k] = scan.nextInt();
			}
			Arrays.sort(A);
			System.out.println(A[7]);
		}
	}
}
