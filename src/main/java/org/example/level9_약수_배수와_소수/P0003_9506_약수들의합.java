package org.example.level9_약수_배수와_소수

���_�����_�Ҽ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0003_9506_��������� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());		// �Է� ���� ��
		
		while(n > 2) {
			StringBuilder sb = new StringBuilder();
			int i = 1;		// ��� üũ
			int t = 0;		// ��� Ƚ�� üũ
			int m = 0;		// ������ üũ
			
			int[] n_arr = new int[n];
			sb.append(n + " = ");
			while(i < n) {
				if(n%i == 0) {
					n_arr[t] = i;
					t++;
					sb.append(i + " + ");
					m += i;
				}
				i++;
			}
			
			if(m != n) {
				sb.setLength(0);
				sb.append(String.valueOf(n) + " is NOT perfect.");
			}else {
				sb.delete(sb.lastIndexOf(" + "), sb.lastIndexOf(" + ") + 3);
			}
			
			//bw.write("\n");
			//bw.write(sb.toString());
			System.out.println(sb);
			//bw.flush();
			
			n = Integer.parseInt(br.readLine());
		}

		
		br.close();
		bw.close();
	}
}
