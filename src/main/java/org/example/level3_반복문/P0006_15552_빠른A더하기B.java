package org.example.level3_반복문

�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0006_15552_����A���ϱ�B {
	public static void main(String args[]) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = reader.readLine();
		int T = Integer.parseInt(input);
			
			for(int i = 0; i < T; i++) {
				String AB = reader.readLine();
				String num[] = AB.split(" ");
				
				int a = Integer.parseInt(num[0]);
				int b = Integer.parseInt(num[1]);
				
				writer.write(a + b + "\n");
			}
		
		reader.close();
		writer.flush();
		writer.close();
	}
}

//ù��°�� �õ��� ����� scanner�� �翬�� �ð��ʰ��� ��Ÿ����
//Scanner �� System.out.println �� ������� �ʰ�
//������ �ִ� BufferedReader �ϰ� BufferedWriter �� ����϶�� �ȳ��ؼ�
//�����ؼ� �ۼ��غ��� ��ĳ�ʺ��� ������ ������� ���� ��ٷο�� ����
//������� reader.read()�� int���̱淡 ��µ� ASCII �� ��ȯ�Ǿ� ���ͼ�
//reader.readLine() ���� String���� �ް� �ٽ� Interger.parseInt�� ���������� ��ȯ�Ѵٴ���
//��ȯ���� split���� �������Ѵٴ���.. �ͼ������� ���������� ������ �� ���ŷӴ�
//BufferedWriter �� �� �𸣰�����.. �ϴ� ���� �غ��߰ڴ�.
//�̰͵� ���͵� �ѹ����� ��ôµ� �� ������ ������ �밭 �˰ڴµ� �ٽ� �غ���� �Ѵٸ� �����Ÿ��Ű���
//�ѹ��ۿ� �Ƚ���� ���� �𸣰ڴ� �ͼ���������