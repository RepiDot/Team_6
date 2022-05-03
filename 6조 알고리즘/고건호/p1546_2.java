package algo;

import java.sql.Array;
import java.util.*;

public class p1546_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum =0;
		double max = 0;
		double per = 0;
		double aray[] = new double[scan.nextInt()];
		for(int i=0; i<aray.length; i++) {
			aray[i] = scan.nextDouble();
			if(aray[i]>max) {
				max = aray[i];
			}
		}
		for(int i=0; i<aray.length;i++) {
			sum += aray[i]/max*100;
		}
		per = sum/aray.length;
		System.out.println(per);
	}
}
