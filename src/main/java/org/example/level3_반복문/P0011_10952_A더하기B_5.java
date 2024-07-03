package org.example.level3_반복문

�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0011_10952_A���ϱ�B_5 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String input = br.readLine();
			if(input.equals("0 0")) {
				br.close();
				bw.close();			
				break;
			}
			String num[] = input.split(" ");
			int ab = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
			
			bw.write(String.valueOf(ab) + "\n");
			bw.flush();
			
		}

	}
}
