package algo;

import java.util.*;

public class p9093 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str;
		String[] reverse = null;
		String[] reversedStr = null;
		for(int i = 0; i<n; i++) {
			str = scan.next();
			String[] sic = str.split(" ");
			for(int k =0; k<sic.length; k++) {
				StringBuffer reverse[k] = new StringBuffer(sic[k]);
				String reversedStr = sic[k].reverse().toString();
				
				System.out.println(reversed)
			}
		}

	}

}
