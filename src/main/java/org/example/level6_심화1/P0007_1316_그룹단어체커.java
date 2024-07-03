package org.example.level6_심화1

��ȭ1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P0007_1316_�׷�ܾ�üĿ {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] index = new int[26];
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int check = 0;
			int asc_v_t = 0;
			String input = br.readLine();
			Arrays.fill(index, 0);
			
			for(int j = 0; j < input.length(); j++) {
				char c = input.charAt(j);
				int asc_v = (int) c;
				if(index[asc_v - 97] > 0 && asc_v_t != asc_v) {
					check = -1;
					break;
				}				
				index[asc_v - 97] += 1;
				asc_v_t = (int) c;
			}
			
			if(check == 0) {
				count++;
			}

		}
		bw.write(String.valueOf(count));
		br.close();
		bw.flush();
		bw.close();
		

	}
}

//��ü�� ������ Ʋ������ ���� �����ϰ� §�Ű����� �߰��� ������ ���Դ� ���ĺ��� �ٽ� ������������
//�Ÿ��� ���ǽ��� ������ ���µ� "��� �ϸ� �ɰŰ�����.." �� ������ �ڵ�� �����Ϸ���
//�ټ� �ð��� �ɸ��°Ű���. �ͼ�������
