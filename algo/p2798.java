package algo;

import java.util.*;

public class p2798 {
	public static boolean[] check;
	public static int[] array;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M, N,temp;
		int max = 0;
		N = scan.nextInt();
		M = scan.nextInt();
		
		array = new int[N];
		for(int i = 0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		for(int i = 0; i<array.length; i++) {
			for(int k = i+1; k<array.length; k++) {
				for(int j= k+1; j<array.length; j++) {
					temp = array[i]+array[k]+array[j];
					if(M>=temp&&temp>max) {
						max = temp;
					}
				}
			}
		}
		System.out.println(max);
	}
}