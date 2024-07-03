package org.example.level3_반복문

�ݺ���;

import java.util.Scanner;

public class P0001_2739_������ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 1;
		while(m <= 9) {
			int a = n*m;
			System.out.println(n + " * " + m + " = " + a);
			m++;
		}
			
	}
}
