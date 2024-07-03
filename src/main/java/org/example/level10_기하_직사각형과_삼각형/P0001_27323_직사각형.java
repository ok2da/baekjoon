package org.example.level10_기하_직사각형과_삼각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0001_27323_직사각형 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int A = Integer.valueOf(br.readLine());
		int B = Integer.valueOf(br.readLine());
		
		bw.write(String.valueOf(A*B));
		bw.flush();
		br.close();
		bw.close();
		
	}
}
