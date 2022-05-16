package algo;

import java.util.*;

public class p5622 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] alpa = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};		
		String K = scan.next();
		String T;
		int sum=0;
		if(2<=K.length()&&K.length()<=15) {
			for(int i=0; i<K.length(); i++) {
				T = K.substring(i,i+1);
				switch(T) {
				case "A":
				case "B":
				case "C":
					sum+=2;
					break;
				case "D":
				case "E":
				case "F":
					sum+=3;
					break;
				case "G":
				case "H":
				case "I":
					sum+=4;
					break;
				case "J":
				case "K":
				case "L":
					sum+=5;
					break;
				case "M":
				case "N":
				case "O":
					sum+=6;
					break;
				case "P":
				case "Q":
				case "R":
				case "S":
					sum+=7;
					break;
				case "T":
				case "U":
				case "V":
					sum+=8;
					break;
				case "W":
				case "X":
				case "Y":
				case "Z":
					sum+=9;
					break;
				}
			}
		}
		System.out.println(sum+K.length());
	}
}