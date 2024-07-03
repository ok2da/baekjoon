package org.example.level8_일반수학1

�Ϲݼ���1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0003_2720_��Ź�һ��嵿�� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int T = Integer.parseInt(br.readLine());		//<�׽�Ʈ ����>
		
		for(int i = 0; i < T; i++) {					//�׽�Ʈ ���� ��ŭ �ݺ�
			int C = Integer.parseInt(br.readLine());	//<�Ž��� ��>
				
			bw.write(String.valueOf(C/25) + " ");		//�Ž����� ���� ����
			C = C%25;
			bw.write(String.valueOf(C/10) + " ");		//�Ž����� ���� ����
			C = C%10;
			bw.write(String.valueOf(C/5) + " ");		//�Ž����� ���� ����
			C = C%5;
			bw.write(String.valueOf(C/1) + " ");		//�Ž����� ��� ����

			bw.write("\n");
		}
		
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
