import java.util.Scanner;

public class javaControl{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		double sum = 0;
		double max = 0;
		double[] nums = new double[n];
		for(int i=0; i < n; i++) {
			nums[i] = scanner.nextDouble();
			if(max < nums[i]) max = nums[i];
		}		
		
		for(double i : nums) {
			sum += i/max*100;
		}
		
		System.out.println(sum/n);
		
	}
}