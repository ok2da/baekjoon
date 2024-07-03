package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0009_2908_��� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		String A = new StringBuilder(input[0]).reverse().toString();
		String B = new StringBuilder(input[1]).reverse().toString();

		if(Integer.valueOf(A) > Integer.valueOf(B)) {
			bw.write(A);
		}else {
			bw.write(B);
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}

