package org.example.level2_조건문;

import java.util.Scanner;

public class P0002_9498_시험성적{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		int s = score/10;
		
		switch(s) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("F");
			break;
		case 6:
			System.out.println("D");
			break;
		case 7:
			System.out.println("C");
			break;
		case 8:
			System.out.println("B");
			break;
		case 9:
		case 10:
			System.out.println("A");
			break;	
		}
	}
}

// �������� switch-case ���� ����ϴ°� ����. 
// ����� �ű�� ���� ������ 10���� ������ 0~10���� ������ �Ͽ� �������
// break�� ���� case�� ������ ���
// break���� ����Ǵ� "fall-through" ������ ���� 0~59������ F�� ��µǰ� ����
// ���������� 90~100���� A�� ��µǰ� ��������
