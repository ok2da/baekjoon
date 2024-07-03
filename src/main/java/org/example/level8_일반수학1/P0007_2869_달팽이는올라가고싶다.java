package org.example.level8_일반수학1

�Ϲݼ���1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0007_2869_�����̴¿ö󰡰�ʹ� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		String[] input = br.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int V = Integer.parseInt(input[2]);
		
		int T = (V-B)/(A-B);
		
		if((V-B)%(A-B) != 0) {
			T++;
		}
	
		bw.write(String.valueOf(T));
		br.close();
		bw.flush();
		bw.close();
	}
}
