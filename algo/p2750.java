package algo;

import java.util.*;

public class p2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] array = new int[N];
		int temp = 0;
		for(int i=0; i<N; i++) {
			array[i] = scan.nextInt();
		}
		for(int i=0; i<N; i++) {
			for(int k=i+1; k<N; k++) {
				if(array[i]>array[k]) {
					temp = array[i];
					array[i] = array[k];
					array[k]=temp;
				}
			}
		}
		for(int value : array) {
			System.out.println(value);
		}
	}
}
