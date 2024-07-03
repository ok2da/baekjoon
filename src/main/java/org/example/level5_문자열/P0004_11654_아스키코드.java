package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0004_11654_�ƽ�Ű�ڵ� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		char asc = input.charAt(0);
		int result = (int) asc;
		bw.write(String.valueOf(result));
		br.close();
		bw.flush();
		bw.close();

	}
}
