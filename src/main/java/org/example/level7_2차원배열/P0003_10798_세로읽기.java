package org.example.level7_2차원배열

�����迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0003_10798_�����б� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[][] result = new String[5][15];
		int length = 0;
		
		for(int i = 0; i < 5; i++) {
			String[] input = br.readLine().split("");
			length = input.length;
			for(int j = 0; j < length; j++) {
				result[i][j] = input[j];
			}
		}
		
		for(int k = 0; k < 15; k++) {
			for(int l = 0; l < 5; l++) {
				if(result[l][k] != null) {
					bw.write(String.valueOf(result[l][k]));
				}
			}				
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}

//��� Ǯ�� Ǯ������ ��� �ϴ� ������θ� �ϴ°� ���Ƽ� ã�ƺ���
//char �������� Ǫ�� ��ĵ� �־���. Ǯ�� Ǯ��, �������� �ͼ��ϰ� �ϸ鼭
//���ο�͵� �� ����߰ڴ�.