package org.example.level2_조건문

���ǹ�;

import java.util.Scanner;

public class P0007_2480_�ֻ������� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		
		int r = 0;
		
		if(f == s && s == t) {		//���� �� 3��
			r = 10000 + (f * 1000);
		}else if(f == s || f == t) {//���� �� 2�� 1
			r = 1000 + (f * 100);
		}else if(s == t) {			//���� �� 2�� 2
			r = 1000 + (s * 100);
		}else {						//��� �ٸ� ��
			int max = f;
			if(max < s) max = s;
			if(max < t) max = t;
			r = max * 100;
		}
		
		System.out.println(r);
	}
}

// �����ϰ� �ôµ� �������� �񱳿��� �Ǽ��� ������, ���� ����� ��Ծ ���ߴٰ�
// �����Ͽ� ���ƴ��� �������� �ξ� �� �������� �⺻�⸦ �� �� �÷��߰���