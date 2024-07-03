package org.example.level3_반복문

�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0012_10951_A���ϱ�B_4 {
public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String input;
		
		while((input = br.readLine()) != null) {
			if(input == null) {
				br.close();
				bw.close();					
			}
			int a = input.charAt(0) - 48;
			int b = input.charAt(2) - 48;
			
			bw.write(String.valueOf(a+b) + "\n");
			bw.flush();
			
		}
		

	}
}

//�Է��� ���� �� �� ��� ã�ƺô��� EoF(End of File) �� �����̶�� �Ѵ�.
//EoF�� �Է¿��� �� �̻� ���� �� �ִ� �����Ͱ� ������ ������ ���� ���Ѵٰ� �Ѵ�
//���� �� �ִ� �����Ͱ� ���ٴ� ���� �Է��� ���� ���� �� = null

//����� ã�ƺ��� ���������� �־���.
//1. Scanner�� ����ϴ� ���
//2. BufferedReader + StringTokenizer�� ����ϴ� ���
//3. BufferedReader + String.charAt()�� ����ϴ¹��
//3���� Ư���ؼ� ��ôµ� �ƽ�Ű�ڵ�(..)���� ��ȯ�ؼ� -48 �Ǵ� -'0'�� �ؼ� ���ڷ� ��ȯ�� ���� ����̶�� �Ѵ�
//������ ����Ե� �̰� ���� �����ٴ°� ���� �ٸ��͵��� �ΰ������� �ڵ����� ���𰡸� ���ܿ�����
//�ӵ��� �������°Ű���