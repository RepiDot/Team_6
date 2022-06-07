package algo;

import java.util.*;

public class p2605 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, M;
		N = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			M=scan.nextInt();
			if(i==0) {
				list.add(1);
			}else {
				list.add(i-M,i+1);
			}
		}
		for(int i :list)
			System.out.print(i+ " ");
	}
}