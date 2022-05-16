package algo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1,num2,num3;
		int result = 0;
		int max = 0;
		int N = scan.nextInt();
		for(int i=0; i<N; i++) {
			num1=scan.nextInt();
			num2=scan.nextInt();
			num3=scan.nextInt();
			if(num1==num2&&num2==num3&&num1==num3) {
				result = 10000+num1*1000;
			}else if(num1==num2||num1==num3) {
				result = 1000+num1*100;
			}else if(num2==num3) {
				result = 1000+num2*100;
			}else {
				result=Math.max(num1, Math.max(num2, num3))*100;
			}
			if(max<result) {
				max = result;
			}
		}
		System.out.println(max);
		scan.close();
	}
}
