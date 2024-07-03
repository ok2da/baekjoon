package org.example.level4_1차원_배열

����_�迭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0005_10810_���ֱ� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String Num = br.readLine();
		String[] NM = Num.split(" ");
		int N = Integer.parseInt(NM[0]);	//�ٱ��� ����
		int M = Integer.parseInt(NM[1]);	//�� ���� Ƚ��
			
		int basket[] = new int[N];
		
		for(int t = 0; t < M; t++) {
			String ball = br.readLine();
			String[] ijk = ball.split(" ");
			int i_num = Integer.parseInt(ijk[0]);
			int j_num = Integer.parseInt(ijk[1]);
			int k_num = Integer.parseInt(ijk[2]);
			
			for(int i = i_num; i <= j_num; i++) {
				basket[i-1] = k_num;
			}
			
		}
		
		
		for(int b : basket) {
			System.out.print(b + " ");
		}
	}
}

//���� �����ϴµ� �� �ð��� �ɷ����� �׷��� ��ã�ƺ��� ������ Ǯ���ٴ°� ����� ����