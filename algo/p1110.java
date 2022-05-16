package algo;

import java.util.*;

public class p1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int count = 0;
		int sum = a;
		
		while (true) {
			a = ((a%10)*10) + (((a/10) + (a%10)) %10);
			count++;
			
			if(sum == a) {
				break;
			}
		}
		System.out.println(count);
	}
}