package algo;

import java.util.*;

public class p15649 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M, N;
		N = scan.nextInt();
		M = scan.nextInt();
		if(M<=N) {
			if(M==1) {
				for(int i = 1; i<=N; i++) {
					System.out.println(i);
				}
			}else {
				for(int i = 1; i<=N; i++) {
					for(int k = 1; k<=N; k++) {
						if(i==k) {
							
						}else {
							System.out.println(i+" "+k);
						}
					}
				}
			}
		}

	}

}
