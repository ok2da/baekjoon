package org.example.level6_심화1

��ȭ1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0003_2444_�����7 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int count_star = 1;
		int count_space = 1;
		
		for(int i = 0; i < (2*N-1); i++) {

			for(int j = 0; j < N-count_space; j++) {
				bw.write(" ");
			}
			
			for(int t = 0; t < count_star; t++) {
				bw.write("*");
			}
			
			if(i >= N-1) {
				count_star -= 2;
				count_space -= 1;
			}else {
				count_star += 2;
				count_space += 1;
			}
			bw.write("\n");
		}
		
		
		br.close();
		bw.flush();
		bw.close();

	}
}

//����� ������ �������� �غ��°Ű���. ���²� ���ϴ� ����� ���� 70~80%������ �ٷ� �����°� ������,
//�� ������ ������, �ٵ�Ⱑ ���� ���� �ʴ´�. ���õ��� ������.
