package org.example.level3_반복문

�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0007_11021_A���ϱ�B_7 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		int T = Integer.parseInt(input);
			
			for(int i = 0; i < T; i++) {
				String AB = reader.readLine();
				String num[] = AB.split(" ");
				
				int a = Integer.parseInt(num[0]);
				int b = Integer.parseInt(num[1]);
				
				System.out.println("Case #" + (i+1) + ": " + (a+b));

			}
		
		reader.close();

	}
}

//������ �ߴ� �ڵ带 �����ϴٰ� ��� ������ �ڼ��� ���� �ʾҴ� �Ǽ��� �����Ű���
//������ �� �ڼ��� ���߰ڴ� ^^;