package algo;

import java.util.*;

public class p2292 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnt = 1;
		int sum = 1;
		while(true) {
			if(N==1) {
				System.out.println(1);
				break;
			}else if(N>sum&&N<=sum+cnt*6) {
				cnt++;
				System.out.println(cnt);
				break;
			}else {
				sum += cnt*6;
				cnt++;
			}
		}
	}
}