package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P0006_10809_���ĺ�ã�� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		
		for(char c = 'a'; c <= 'z'; c++) {
			bw.write(S.indexOf(c) + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}

// ó���� �̰����� �õ��غ��ٰ� for���� ������ ���ٵ��� �迭�� ������ ���ٴ��� �ؼ� ���غ��� ������
// ������ ����� �������� �ʹ� ���ư��°Ű��� ã�ƺô��� �ƴϳ� �ٸ���
// ��û ������ ����� �־���.. ���ο� Ȱ������ �˰ԵǾ� �ش� �˰����� �ǻ��ܳ��ƾ߰ڴ�.

// indexOf() = Ư�� ���ڿ����� ������ ���ڰ� ó�� ������ �ε����� ��ȯ��

//  ����)
//	String str = "Hello, World!";
//	int index = str.indexOf('o'); 	// ���� 'o'�� ó������ �����ϴ� �ε����� ã��
//	System.out.println(index); 		// ���: 4 (0���� �����ϴ� �ε���)