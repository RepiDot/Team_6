package algo;

import java.util.*;

public class p1978{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnt = 0;
		for(int i=0; i<N; i++) {
			int num = scan.nextInt();
			boolean hap = true;
			if(num==1) {
				continue;
			}
			for(int k=2; k<=Math.sqrt(num); k++) {
				if(num%k==0) {
					hap = false;
				}
			}
			if(hap) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
