package algo;

import java.sql.Array;
import java.util.*;

public class p1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double aray[] = new double[scan.nextInt()];
		for(int i=0; i<aray.length; i++) {
			aray[i] = scan.nextDouble();
		}
		double sum = 0;
		Arrays.sort(aray);
		for(int i=0; i<aray.length; i++) {
			sum += aray[i]/aray[aray.length-1]*100;
		}
		System.out.println("Æò±ÕÀº" + sum/aray.length);
	}
}