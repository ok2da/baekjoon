package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0001_27866_���ڿ͹��ڿ� {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		StringBuilder sb = new StringBuilder(S);
		
		int i = Integer.parseInt(br.readLine());
		
		br.close();
		bw.write(sb.charAt(i-1));
		bw.flush();
		bw.close();
			
	}
}

//���� ó�� ���ڿ� ������ �غ��µ�.. ������ �־����µ��ٰ� chatAt()�� 0���� �����ϱ� ������ -1 ���־���