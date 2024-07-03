package org.example.level7_2차원배열

�����迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0002_2566_�ִ� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] num = new int[9][9];
		int max = -1;
		int[] xy = new int[2];
		for(int i = 0; i < 9; i++) {
			String[] input = br.readLine().split(" ");
			for(int j = 0; j < input.length; j++) {
				num[i][j] = Integer.parseInt(input[j]);
				if(num[i][j] > max) {
					max = num[i][j];
					xy[0] = i+1;
					xy[1] = j+1;
				}
			}
		}

		bw.write(String.valueOf(max) + "\n");
		bw.write(String.valueOf(xy[0]) + " " + String.valueOf(xy[1]));
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}

//ó���� ���� ������ �̻��ϰ� ���� �������� Ʋ�ȴٰ� ���ͼ� ��Ȳ�ߴ�.
//for���� ���������� Ȥ�� �߰��� �߸��� ������ �ֳ� �; ã�ƺôµ�
//������ ������ ������ �� �ٿ��ôµ� �̰��� �� �Ǵ°� �ű��ϳ�