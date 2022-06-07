package algo;
import java.util.*;
public class p11659 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] array = new int[N];
		for(int i=0; i<N; i++) {
			array[i] = scan.nextInt();
		}
		for(int k=0; k<M; k++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int sum = 0;
			for(int t=i-1; t<=j-1; t++) {
				sum += array[t];
			}
			System.out.println(sum);
		}
	}
}