package algo;

import java.util.*;
import java.io.*;

public class p11945 {
	private static BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String args[]) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String py[] = scan.readLine().split(" ");
	    int X = Integer.parseInt(py[0]);
	    int Y = Integer.parseInt(py[1]);
	    for (int i = 0; i < X; i++) {
	    	String str = scan.readLine();
	        for (int j = 0; j < Y; j++) {
	            print.write(str.charAt(Y - j - 1));
	        }
	        print.write("\n");
	    }
	    print.flush();
	}
}