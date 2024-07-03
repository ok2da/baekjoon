package org.example.level6_심화1

��ȭ1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0005_1157_�ܾ���� {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int[] r = new int[26];
		int max = 0;
		char result = 0;
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			int cc = (int) c;
			
			if(cc <= 90) {
				r[cc-65]++;
			}else {
				r[cc-97]++;
			}
		}
		
		for(int rr : r) {
			if(rr > max) {
				max = rr;
			}
		}
		
		int check = 0;
		for(int j = 0; j < r.length; j++) {
			if(r[j] == max) {
				result = (char) (j+65);
				check++;
			}
		}
		
		if(check > 1) {
			result = 63;
		}
		
		bw.write(String.valueOf(result));
			
		br.close();
		bw.flush();
		bw.close();

	}
}

//�̹����� ���� �ƽ�Ű�ڵ尪�� �����Ͽ� ���� Ǯ���� �˰��� ������ ������ Ȱ���ؼ� �� ®����
//������� �ùٸ��� �������� ���ؿ����� Ʋ�ȴٰ� ���ͼ� ��Ȳ�ߴ�. �ٸ������ Ǯ�� ������ ���� ����������
//�ٸ����� �����µ� �� �� ã�ƺ��� ���� ȯ�濡 ���� ��°������� char�� �������� �����ϴ� ���ڸ� ����ϴ�
//�������� ������ ���� �� �ִٰ� �Ͽ��� String���� �ѹ��� ���ڿ��� ��ȯ�Ͽ����� �Ϸ�ƴ�.
//ȯ�渶�� ������� �ٸ� �� �ִٴ°Ϳ� ���� �ٽ� �ѹ� ������ �� �ִ� ��������
