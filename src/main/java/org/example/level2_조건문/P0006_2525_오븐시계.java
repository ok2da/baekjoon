package org.example.level2_조건문

���ǹ�;

import java.util.Scanner;

public class P0006_2525_����ð� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int m2 = sc.nextInt();
		
		int p = m+m2;
		
		if(p >= 60) {
			int q = p/60;
			int r = p%60;
			h = h+q;
			m = r;
			if(h >= 24) {
				h = h - 24;
			}
		}else {
			m = m + m2;
		}

		System.out.println(h + " " + m);
		
	}
}

// �߰��� �д����� 0 �� C �� 1,000 �̹Ƿ� ���� ���ڰ� 60 �̸��ϰ�� �״�� ���ϰ�
// �߰��� ���ڰ� 60�̻��� ���
// 60���� ������ ���� �ð��� �߰��ϰ� �������� ���Ͽ� ������ �����ϰ� ����
// ���� ����� �ð��� 24�̻��� ��� -24�� ���� ������ ��Ÿ���ų� ���� �ð��� ��Ÿ���� ��