package org.example.level4_1차원_배열

����_�迭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0006_10813_���ٲٱ� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String Num = br.readLine();
		String[] NM = Num.split(" ");
		int N = Integer.parseInt(NM[0]);	//�ٱ��� ����
		int M = Integer.parseInt(NM[1]);	//���� �ٲ� Ƚ��
			
		int basket[] = new int[N];

		for(int i = 0; i < N; i++) {
			basket[i] = i + 1;
		}
		
		for(int t = 0; t < M; t++) {
			String ball = br.readLine();
			String[] ijk = ball.split(" ");
			int i_num = Integer.parseInt(ijk[0])-1;
			int j_num = Integer.parseInt(ijk[1])-1;
			
			int imsi_num = basket[i_num];
			basket[i_num] = basket[j_num];
			basket[j_num] = imsi_num;
		}
		
		
		for(int b : basket) {
			System.out.print(b + " ");
		}
	}
}