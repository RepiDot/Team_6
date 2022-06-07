package algo;

import java.util.*;
import java.util.InputMismatchException;

public class p1362 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 1;
			while(true) {
				int o = scan.nextInt();
				int w = scan.nextInt();
				int min = o/2;
				int max = o*2;
				if(w==0&&o==0) {
					break;
				}
				if(w>0&&o>0) {
					while(true) {
						String Active = scan.next();
						String n=scan.next();
						if(Active.equals("F")) {
							w += Integer.parseInt(n);
						}
						if(Active.equals("E")) {
							w -= Integer.parseInt(n);;
						}
						if(w<=0) {
							break;
						}
						if(Active.equals("#")&&n.equals("0")) {
							break;
						}
					}
				}
				if(w<=0) {
					System.out.println("RIP");
					break;
				}
				if(w>min&&w<max) {
					System.out.println(cnt+" :-)");
				}else {
					System.out.println(cnt+" :-(");
				}
				cnt++;
			}
	}
}
