package algo;

import java.util.*;

public class p9093 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[] str = new String[n];
		for(int i = 0; i<n; i++) {
			str[i]=scan.nextLine();
		}
		for(int i=0; i<n; i++) {
			String[] sic =  str[i].split(" ");
			for(int k=0; k<sic.length;k++) {
				int size = sic[k].length()-1;
				String sum = "";
				while(size>=0) {
					sum = sum+sic[k].charAt(size--);
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}
