package org.example.level7_2차원배열

�����迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0004_2563_������ {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[][] paper = new int[100][100];
		int max = 0;
		
		for(int i = 0; i < count; i++) {
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					paper[y+j][x+k]++;
					
					if(paper[y+j][x+k] == 1) {
						max++;
					}
				}
			}
		}
		
		bw.write(String.valueOf(max));
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}

//�̹� ������ ������ ������ �����ϱ���� �ð��� �� �ɸ��� ����.. ���� �� �ķδ� �밭 ��� �ؾ��� ���� �˰ڴµ�
//�̹��� x�� y������ �����Ϸ��� �̰� �ڵ�� Ǯ����� �ϴ� ���� ���ſ����� �� �� �����غ��� �� Ǯ��� ����