package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0003_9086_���ڿ� {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String a = br.readLine();			
			int length = a.length();
			
			StringBuilder sb = new StringBuilder();
			if(length == 1) {
				sb.append(a).append(a);
			}else {	
				sb.append(a.charAt(0)).append(a.charAt(a.length() - 1));
			}
			sb.append("\n");
			bw.write(sb.toString());
		}
		
		br.close();
		bw.flush();
		bw.close();
			
	}
}
