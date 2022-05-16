package algo;

import java.util.*;

public class p2439 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			for(int k=0; k<num; k++) {
				if(k<num-i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
