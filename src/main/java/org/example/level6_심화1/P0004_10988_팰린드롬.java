package org.example.level6_심화1

��ȭ1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0004_10988_�Ӹ���� {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split("");
		int l = input.length;
		
		int check = 1;
		
			for(int i = 0; i < l/2; i++) {
				if(!input[i].equals(input[l-i-1])) {
					check = 0;
					break;
				}
			}

		bw.write(String.valueOf(check));
			
		br.close();
		bw.flush();
		bw.close();

	}
}

//ó���� if���� true,false �˻�� �ΰ��� ����Ͽ� 1,0�� ������ ����� Ʋ�ȴٰ� �ϱ淡
//�� �� ������ �غ��� Ʋ�ȴ���, ���� �Ȱ����� �ٽ� 1�� ��ȯ�ϱ� ������ Ʋ�� �� �ۿ� ������.
//������ ����� ���� �����ߴ� ������ ����������� �����صΰ� �־��µ� �������� Ʋ�ȴ� ���̾���
//���� �� �й�����

