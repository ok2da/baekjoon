package org.example.level6_심화1

��ȭ1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0006_2941_ũ�ξ�Ƽ�ƾ��ĺ� {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split("");
		String[] ca = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int r = 0;
		int l = input.length;
		for(int i = 0; i < l; i++) {
			boolean check = false;
			for(int j = 0; j < ca.length; j++) {
				if(i+2 < l && (input[i]+input[i+1]+input[i+2]).equals(ca[j])){
					r++;
					i += 2;
					check = true;
					break;
				}else if(i+1 < l && (input[i]+input[i+1]).equals(ca[j])) {
					r++;
					i += 1;
					check = true;
					break;
				}
			}
			if(!check) {
				r++;
			}

		}
		
		bw.write(String.valueOf(r));
		
		br.close();
		bw.flush();
		bw.close();

	}
}

//���� �ǹ�������� ��¦ �Ӹ��� �θ̴� �������� �ε����� �ͼ�ġ ������ ���ڱ�
//���ǿ� ���������� for���� ������Ű�� ���� ������ �ϴ� ������ �� �����غô��� �ȴ�!
//���ǽĵ� ���� �ȵǸ� �ƽ�Ű�ڵ� ������ ��ȯ�ؾ��ұ� �;��µ� �������� ���� �ٵ���ִ� �Ǿ���.
