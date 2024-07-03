package org.example.level2_조건문

���ǹ�;

import java.util.Scanner;

public class P0001_1330_�μ����ϱ� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A < B) {
			System.out.println("<");
		}else if(A > B) {
			System.out.println(">");
		}else if(A == B) {
			System.out.println("==");
		}
	}
}
