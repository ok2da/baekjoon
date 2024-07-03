package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0011_11718_�״������ϱ� {
	public static void main(String args[]) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	while(true) {
		String S = br.readLine();
		if(S == null) {
			break;
		}
		bw.write(S + "\n");
	}
	
	br.close();
	bw.flush();
	bw.close();
	
	}
}

//�״�� ����ϱ⸸ �ϸ� �Ǽ� �� �ʹ� ���� ���� �ƴϾ� ��� �ߴٰ�
//��Ÿ�� ���� �ι� �°� ��������� �������� ����� �������� ��������� �ָ��� ������ ��찡
//�־��µ� �ݻ� �� ��Ծ���ȴ�. �Ǽ��� �ϰ�, �ذ���� ����ϰ� �ͼ�������
