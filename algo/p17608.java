package algo;

import java.util.*;

public class p17608 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnt = 1;
		int[] array = new int[N];
		for(int i=0; i<N; i++) {
			array[i] = scan.nextInt();
		}
		int max = array[N-1];
		for(int i=N-1; i>=0; i--) {
			if(array[i]>max) {
				max=array[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
