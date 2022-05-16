package algo;

import java.util.*;

public class p1002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1, x2, y1, y2, r1, r2;
		int range;
		int cyc = scan.nextInt();
		for(int i=0; i<cyc; i++) {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			r1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			r2 = scan.nextInt();
			range = (int) Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
			if(range==0&&r1==r2) {
				System.out.println("-1");
			}else if(Math.abs(r1-r2)<range && +range<Math.abs(r1+r2)) {
				System.out.println("2");
			}else if(r1+r2==range || r1-r2==range) {
				System.out.println("1");
			}else if(Math.abs(r1-r2)>range||range>Math.abs(r1+r2)) {
				System.out.println("0");
			}
		}
	}
}
