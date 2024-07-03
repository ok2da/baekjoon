package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0010_5622_���̾� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split("");
		
		int l = input.length;
		
		int result = 0;
		for(String s : input) {
			char c = s.charAt(0);
			int cc = (int) c - 65;
			if(cc <= 2) {
				result += 2;
			}else if(cc <= 5) {
				result += 3;
			}else if(cc <= 8) {
				result += 4;
			}else if(cc <= 11) {
				result += 5;
			}else if(cc <= 14) {
				result += 6;
			}else if(cc <= 18) {
				result += 7;
			}else if(cc <= 21) {
				result += 8;
			}else if(cc <= 25) {
				result += 9;
			}
		}

		bw.write(String.valueOf(result + l));
		
		br.close();
		bw.flush();
		bw.close();
	}
}

//�񱳸� ��� �ұ� �ϴٰ� �ƽ�Ű�ڵ尪�� ��ȯ�ϴ°� �������� ���ٰ� if���� ������ �޾Ҵµ�
//�� �ϰ� ���� switch-case�� ����Ұ� �׷��� �ͼ��� ����� ���°� ������ ��� �ϴ±迡
//�� �ẻ���� �ִ��� �Ẹ��, ������ ������� ���� ����� ���°� ��ǥ�� �ϰ� �־��µ� 
//���� �� �ξ�� �ڴ�.