package org.example.level3_반복문

�ݺ���;

import java.util.Scanner;

public class P0004_25304_������ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int r = 0;
		int arr[][] = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i][0] = a;
			arr[i][1] = b;
			r = r + (arr[i][0] * arr[i][1]);
		}
		
		if(X == r) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}

//���� ������ �迭������ Ǯ� ������ �迭�� ���� ���ʴ� �; Ǯ���µ� �̰͵� ��Ծ
//�������ٰ� �ᱹ �����ߴµ� �ܼ��ϰ� �߰��� �����غ��ϱ� ���� �Ƚᵵ �Ǵ°ſ���..? �ʹٰ�
//�׳� �����ϴ°� �ߴ� ġ��. �迭�����ϰ� �ܼ� ������� �ٽ� �غ��ϱ� �����̿���