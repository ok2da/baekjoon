package org.example.level3_반복문

�ݺ���;

import java.util.Scanner;

public class P0003_8393_�� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		
		for(int i = 0; i <= n; i++) {
			r = r+i;
		}
		
		System.out.println(r);
		
	}
}

