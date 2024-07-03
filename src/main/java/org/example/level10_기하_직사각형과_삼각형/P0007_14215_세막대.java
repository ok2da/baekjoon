package org.example.level10_기하_직사각형과_삼각형

����_���簢����_�ﰢ��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0007_14215_������ {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		int a = Integer.valueOf(token.nextToken());
		int b = Integer.valueOf(token.nextToken());
		int c = Integer.valueOf(token.nextToken());
		
		int max = Math.max(a, Math.max(b, c));
		int min1 = Math.min(a, Math.min(b, c));
		int min2 = a+b+c - max - min1;
		
		int result;
		
		if(max < min1+min2) {
			result = max + min1 + min2;
		}else {
			result = max - (max-min1-min2+1) + min1 + min2;
		}
		
		bw.write(String.valueOf(result));

		bw.flush();
		br.close();
		bw.close();
		
	}

}
