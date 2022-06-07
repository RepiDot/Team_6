package algo;

import java.util.*;

public class p2587 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;
		int avg = 0;
		for(int i =0; i<5; i++) {
			array[i] = scan.nextInt();
			sum += array[i];
		}
		avg = sum/5;
		Arrays.sort(array);
		System.out.println(avg);
		System.out.println(array[2]);
	}
}
