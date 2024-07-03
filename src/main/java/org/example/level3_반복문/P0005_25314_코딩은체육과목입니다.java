package org.example.level3_반복문

�ݺ���;

import java.util.Scanner;

public class P0005_25314_�ڵ���ü�������Դϴ� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int L = N/4;
		
		for(int i = 0; i < L; i++) {
			System.out.print("long ");
		}
		
		System.out.print("int");
	}
}
