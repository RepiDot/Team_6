package algo;

import java.util.*;

public class p10815 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int check = 0;
		int N = scan.nextInt();
		int[] Fnum = new int[N];
		String str = scan.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		for (int i=0; i< N; i++) {
			Fnum[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(Fnum);
		StringBuilder sb = new StringBuilder();
		int M = scan.nextInt();
		String sstr = scan.nextLine();
		StringTokenizer sst = new StringTokenizer(sstr);
		for(int i=0; i<M; i++) {
			int temp = Integer.parseInt(sst.nextToken());
			sb.append(binarySearch(Fnum, N, temp) + " ");
		}
	}
	private static int binarySearch(int[] fnum, int n, int temp) {
		int first = 0;
        int last = n - 1;
        int mid = 0;
 
        while (first <= last) {
            mid = (first + last) / 2;
 
            if (fnum[mid] == temp) {
                return 1;
            }
 
            if (fnum[mid] < temp) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
 
        return 0;
    }
}
