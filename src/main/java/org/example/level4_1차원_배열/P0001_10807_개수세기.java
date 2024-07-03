package org.example.level4_1차원_배열

����_�迭;

import java.util.Scanner;

public class P0001_10807_�������� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		int r = 0;
		
		for(int n : num) {
			if(n == v) {
				r++;
			}
		}
		
		System.out.println(r);
		
	}
}

//���� Scanner ���鼭 ���� �� �����µ� bufferedReader ���ٰ� �ٽ� Scanner ���ϱ�
//�ӵ� ���̰� ��û���� ü���ȴ�..