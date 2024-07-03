package org.example.level10_기하_직사각형과_삼각형

����_���簢����_�ﰢ��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0006_5073_�ﰢ�������� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token;
		
		while(true) {
			token = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(token.nextToken());
			int B = Integer.valueOf(token.nextToken());
			int C = Integer.valueOf(token.nextToken());
			
			if(A == 0 && B == 0 && C == 0) {
				break;
			}
			
			bw.write(CheckTriangle(A,B,C) + "\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}

	private static String CheckTriangle(int A, int B, int C) {
		String Result = "";
		int Max = A;
		int Min1 = B;
		int Min2 = C;
		
		if(A < B) {
			Max = B; 
			Min1 = A;
			if(B < C) {
				Max = C; 
				Min2 = B;
			}
		}else if(A < C){
			Max = C; 
			Min2 = A;
		}
		
		if(Max < Min1+Min2) {
			if(A == B && B == C && C == A) {
				Result = "Equilateral";
			}else if(A == B || B == C || C == A){
				Result = "Isosceles";
			}else if(A != B && B != C && C != A) {
				Result = "Scalene";				
			}
		}else {
			Result = "Invalid";
		}
		
		return Result;
	}
}
