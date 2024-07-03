package org.example.level3_반복문

�ݺ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0008_11022_A���ϱ�B_8 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		int T = Integer.parseInt(input);
			
			for(int i = 0; i < T; i++) {
				String AB = reader.readLine();
				String num[] = AB.split(" ");
				
				int a = Integer.parseInt(num[0]);
				int b = Integer.parseInt(num[1]);
				
				System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b));

			}
		
		reader.close();

	}
}
