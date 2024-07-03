package org.example.level4_1차원_배열

����_�迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0004_2562_�ִ� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int line = 0;
		int nums[] = new int[9];
		
		for(int i = 0; i < 9; i++) {
			nums[i]= Integer.parseInt(br.readLine());
			if(nums[i] > max) {
				max = nums[i];
				line = i + 1;
			}
		}
		
		br.close();
		bw.write(max + "\n" + line);
		bw.flush();
		bw.close();
	}
}

//������ ���Ŀ��� �� �����̸鼭 �ظŴ°Ű���..�Ф� ���� ���س��� ���̷� �ȳ�������̴�
//�ݺ��ϴٺ��� �ͼ������Ű��� ȭ����
