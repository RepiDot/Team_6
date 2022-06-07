package algo;

import java.util.*;

public class p14726 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[] array = new long[16];
		int sum=0;
		for(int i=0; i<N; i++) {
			long temp = scan.nextLong();
			for(int k=15; k>0; k--) {
				array[k]=temp%10;
			}
			for(int k=0; k<16; k++) {
				if(k%2==1) {
					array[k] *= 2;
					if(array[k]>10) {
						array[k]=array[k]/10+array[k]%10;
					}
				}
			}
			for(int k=0; k<16; k++) {
				sum += array[k];
			}
			if(sum%10==0) {
				System.out.println("T");
			}else {
				System.out.println("F");
			}
		}
	}

}
