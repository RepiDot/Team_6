package algo;

import java.util.*;

public class p10870 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, sum, First, Zero;
		First = 1;
		Zero = 0;
		sum = 0;
		N= scan.nextInt();
		if(N==0) {
			System.out.println(Zero);
		}else if(N==1) {
			System.out.println(First);
		}else if (N<=20) {
			for(int i =2; i<=N; i++) {
				sum = First+Zero;
				Zero = First;
				First = sum;	
			}
			System.out.println(sum);
		}

	}

}
