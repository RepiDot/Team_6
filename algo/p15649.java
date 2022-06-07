package algo;

import java.util.*;

public class p15649 {
	public static boolean[] check;
	public static int[] array;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M, N;
		N = scan.nextInt();
		M = scan.nextInt();
		
		array = new int[M];
		check = new boolean[N];
		ze(N,M,0);
	}
	
	public static void ze(int N,int M, int range) {
		if(range == M) {
			for(int ins : array) {
				System.out.print(ins+ " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i<N; i++) {
			if(!check[i]) {
				check[i] = true;
				array[range] = i+1;
				ze(N, M, range+1);
				check[i] = false;
			}
		}
	}
}