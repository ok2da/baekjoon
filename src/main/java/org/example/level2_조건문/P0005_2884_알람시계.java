package org.example.level2_조건문

���ǹ�;

import java.util.Scanner;

public class P0005_2884_�˶��ð� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			m = m + 15;
			h--;
			if(h < 0) {
				h = 23;
			}
		}else if(m >= 45) {
			m = m - 45;
		}
		
		System.out.println(h + " " + m);
		
	}
}

// 24�ð� ǥ����̰� ���� 0:0 ~ �� 23:59 �� ������
// 45���� �����ϴµ�, �־��� ���� 45 �̸��̶�� ������ 15�� ���ϰ� �ð��� 1 ��
// �ݴ�� 45�� �̻��̶�� �׳� 45�� ��
