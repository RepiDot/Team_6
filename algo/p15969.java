package algo;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 1000;
		int max = 0;
		int score;
		int N = scan.nextInt();
		for(int i = 0; i<N; i++) {
			score = scan.nextInt();
			if(score<min) {
				min = score;
			}
			if(score>max) {
				max = score;
			}
		}
		System.out.println(max-min);
	}
}