package algo;

import java.util.*;

public class p1463 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int tempN=N;
		int temp = 0;
		int sum = 0;
		while(N>1) {
			if(N%2==1&&N%3!=0) {
				N=N-1;
				temp++;
			}else if(N%2==1&&N%3==0) {
				N=N/3;
				temp++;
			}else if(N%2==0) {
				if(N%3==0&&N/3<N/2) {
					N=N/3;
				}else if(N%3!=0) {
					N=N/2;
				}
				temp++;
			}
		}
		while(tempN>1) {
			if(tempN%3==2&&tempN%2==0) {
				tempN=tempN/2;
				sum++;
			}else if(tempN%3==2&&tempN%2!=0) {
				tempN=tempN-1;
				sum++;
			}else if(tempN%3==1&&tempN%2==0) {
				tempN=tempN-1;
				sum++;
			}else if(){
				
			}
				else if(tempN%3==0) {
				tempN=tempN/3;
				sum++;
			}
		}
		if(temp<=sum) {
			System.out.println(temp);
		}else {
			System.out.println(sum);
		}
	}
}
