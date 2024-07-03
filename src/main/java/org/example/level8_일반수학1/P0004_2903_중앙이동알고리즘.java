package org.example.level8_일반수학1

�Ϲݼ���1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0004_2903_�߾��̵��˰��� {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());		//<�簢���� �� ���� Ƚ��>
		
		int R = (int) Math.pow((Math.pow(2, N)+1) , 2);	//�� ���� ��

		
		bw.write(String.valueOf(R));
		
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
// �� ���� �� ���� ���� = ��
//�˰��� 1. (2��N����+1)�� ����

//n			0		1			2			3			4
//�� ����		4		9			25			81			289
//�� �� �� ����	2		3			5			9			17
//����		-	((2-1)+2)�� 	((3-1)+3)�� 	((5-1)+5)�� 	((9-1)+9)�� 
