package org.example.level12_브루트포스

���Ʈ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0003_19532_���������鰭���Դϴ� {
	public static void main(String args[]) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		
		int d = Integer.valueOf(st.nextToken());
		int e = Integer.valueOf(st.nextToken());
		int f = Integer.valueOf(st.nextToken());
		
		
		for(int i = -999; i <= 999; i++) {
			for(int j = -999; j <= 999; j++) {
				if(a*i + b*j == c && d*i + e*j == f) {
					bw.write(String.valueOf(i) + " " + String.valueOf(j));
				}
			}
		}

		bw.flush();
		br.close();
		bw.close();

	}
}
