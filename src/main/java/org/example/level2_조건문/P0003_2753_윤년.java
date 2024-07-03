package org.example.level2_조건문

���ǹ�;

import java.util.Scanner;

public class P0003_2753_���� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		int test1 = year%4;
		int test2 = year%100;
		int test3 = year%400;
		
		if(test1 == 0 && test2 != 0 || test3 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}

// ���� = ������ 4�� ����̸鼭 100�� ����� �ƴҶ�, �Ǵ� 400�� ����϶�
// 2012��� 4�� ����̸鼭 100�� ����� �ƴϱ� ������ ����
// 1900���� 100�� ����� 400�� ����� �ƴϱ� ������ �ƴ�
// 2000���� 4�� ����̸鼭 400�� ����� ������ ����
// �����̸� 1 �ƴϸ� 0 ���