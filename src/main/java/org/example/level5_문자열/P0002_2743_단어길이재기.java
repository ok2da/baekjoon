package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0002_2743_�ܾ������� {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = br.readLine();
		StringBuilder sb = new StringBuilder(a);
		
		br.close();
		bw.write(String.valueOf(sb.length()));
		bw.flush();
		bw.close();
			
	}
}
