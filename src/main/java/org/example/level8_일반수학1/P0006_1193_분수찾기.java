package org.example.level8_일반수학1

�Ϲݼ���1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0006_1193_�м�ã�� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int N = Integer.parseInt(br.readLine());
		
		int cross_count = 0;			// �밢������ ����+�и� ��
		int count_sum = 0;				// �밢������ ������ �ִ밪
		
		int num = 0;
		int deno = 0;
		
		while(count_sum < N) {
			cross_count++;
			count_sum = count_sum + cross_count;
		}
		
		if(cross_count%2 == 0) {
			num = cross_count - (count_sum - N);
			deno = cross_count + ((count_sum - cross_count) - N) + 1;

		}else {
			num = cross_count + (((count_sum - cross_count) - N) + 1);
			deno = cross_count - (count_sum - N);
		}
		bw.write(String.valueOf(num) + "/" + String.valueOf(deno));
	
		br.close();
		bw.flush();
		bw.close();
	}
}
