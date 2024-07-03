package org.example.level2_조건문

���ǹ�;

import java.util.Scanner;

public class P0004_14681_��и���� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x >= 1 && y >= 1) {
			System.out.println(1);
		}else if(x <= 1 && y >= 1) {
			System.out.println(2);
		}else if(x <= 1 && y <= 1) {
			System.out.println(3);
		}else if(x >= 1 && y <= 1) {
			System.out.println(4);
		}
		
	}
}
