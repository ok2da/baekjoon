package org.example.level4_1차원_배열

����_�迭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0007_5597_�����ȳ��ź� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int Nums[] = new int[31];
		
		for(int i = 1; i < 29; i++) {
			Nums[Integer.parseInt(br.readLine())] = 1;
		}
		
		
		
		for(int j = 1; j < Nums.length; j++) {
			if(Nums[j] != 1) {
				sb.append(j + "\n");
			}
		}
		
		br.close();
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
		
	}
}

//ó���� �迭���� �Է��� ��ȣ�� �ް�, ������ ��, ����ִ� ��ȣ�� ã�� �ظŴٰ� �򰥷��� Ǯ�� ����� ã�ƺ���
//���� ��ȣ�� ���� ã�� �ʰ� �ε�����ȣ���� 1�� �־ �ܼ��� �߰� �ȵ��ִ� �ε����� ã�� ���� ���� Ǭ
//Ǯ�� ����� �־��� �� �� ������ �ܼ���, �ڼ��� �غ��߰ڴ�
