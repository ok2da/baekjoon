package org.example.level6_심화1

��ȭ1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0002_3003_ŷ_��_��_���_����Ʈ_�� {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int[] c = new int[6];
		int[] r = {1,1,2,2,2,8};
		
		for(int i = 0; i < c.length; i++) {
			c[i] = Integer.parseInt(input[i]);
			
			if(c[i] != r[i]) {
				int t = c[i] - r[i];
				if(t > 0) {
					c[i] = r[i] - c[i];
				}else {
					c[i] = Math.abs(t);	
				}
			}else {
				c[i] = 0;
			}
		}
		
		for(int result : c) {
			bw.write(result + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}
}

//������ ������(���밪)���� �ٲ��ִ� Math.abs() �� ã�Ƽ� ���� Ǯ�ٰ�
//�� ��ư� Ǭ��.. ��� ������ ������� ���� ������ ã�ƺ���
//���� �׳� ���⸸ �ϸ� �Ǵ°ſ��٤��� �Ƥ����Ǥ���
