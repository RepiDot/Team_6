import java.util.Scanner;

public class javaControl{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		while(T-- > 0) {
			// 조규현
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int r1 = scanner.nextInt();
			// 백승환
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			int r2 = scanner.nextInt();
			
			// 중점과 반지름 모두 같을 때
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.print(-1);
			}
		}
		
	}
}