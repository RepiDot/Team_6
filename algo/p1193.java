package algo;

import java.util.*;

public class p1193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int v = 1;
		int sum = 0;
		
		while(true) {
			if(x<=v+sum) {
				if(v%2==1) {
					System.out.print((v-(x-sum-1))+"/" + (x-sum));
					break;
				}else {
					System.out.print((x-sum)+"/" + (v-(x-sum-1)));
					break;
				}
			}else {
				sum += v;
				v++;
			}
		}
	}
}
