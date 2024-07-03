package org.example.level3_반복문

�ݺ���;

import java.util.Scanner;

public class P0002_10950_A���ϱ�B_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int arr[] = new int[c];
		
		for(int i = 0; i < c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();			
			arr[i] = a+b;  
		}
		
		for(int r : arr) {
			System.out.println(r);
		}
	}
}


//�������� �Է¹޴� ���� ����� �������� ���� �������µ�, 
//�ٽ� �о�� �ϳ��� �Է��������, ��꿡�� �����ϰ� ����ϴ��� �˾Ҵµ�
//�Է� Ƚ���� ���ϴ� �ſ���.. ���� �ڼ��� �о�߰���

//�׸��� �迭�� ó���� ���� ����µ� �Ⱦ��ٺ��� ��ü ����� ���� ����..
//�ٽ� �ݺ��ؼ� ���� Ǯ��� �ҵ�

//�߰��� �ٸ������ Ǯ�̸� ���ٺ��� Scanner�� �ӵ��� �������̰�
//BufferedReader + StringTokenizer + StringBuilder �� ����ϴ���
//�ӵ��� 1.6~1.8��� �� �����Ű��� �̰͵� ã�ƺ��� �ҵ� 