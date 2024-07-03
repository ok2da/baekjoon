package org.example.level11_시간복잡도

�ð����⵵;

import java.util.Scanner;

public class P0002_24263_�˰������_�˰����Ǽ���ð�2 {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int A[] = new int[n];
		
		int sum = 0;
		int num = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + A[i];
			num++;					// sum = sum + A[i]; �ڵ尡 �����ϴ� ��
		}
		
		System.out.println(num);
		System.out.println(1);

	}
}
