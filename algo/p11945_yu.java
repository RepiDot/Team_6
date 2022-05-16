package algo;

import java.util.Scanner;

public class p11945_yu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, M;
		N = scan.nextInt();
		M = scan.nextInt();
		String str;
		for(int i = 0; i<N; i++) {
			str = scan.next();
			for(int k = M-1; k>=0; k--) {
				System.out.print(str.charAt(k));
			}
			System.out.println();
		}
	}
}
