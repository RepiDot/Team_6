package algo;

import java.util.*;

public class p1181 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = null;
		int len;
		int i = 0;
		int j = 0;
		int tmp;
		int N = scan.nextInt();
		String[] s = new String[N];
		for(i=0; i<N; i++) {
			s[i] = scan.next();
		}
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(s));
		String[] array = hashSet.toArray(new String[0]);
		for(i=0; i<array.length-1; i++) {
			for(int k=i; k<array.length-1; k++) {
				if(array[i].length()>array[k+1].length()) {
					temp=array[i];
					array[i]=array[k+1];
					array[k+1]=temp;
				}
			}
		}
		for(i=0;i<array.length;i++) {
			len = array[i].length();
			for(j=i+1;j<array.length;j++) {
				tmp = array[j].length();
				if(len != tmp) break;
			}
			Arrays.sort(array, i, j);
			i = j-1;
		}
		for(i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}