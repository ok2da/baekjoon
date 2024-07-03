package org.example.level5_문자열

���ڿ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P0008_1152_�ܾ��ǰ��� {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		bw.write(String.valueOf(st.countTokens()));
		
		br.close();
		bw.flush();
		bw.close();
	}
}

//ó���� split ���� ����������, ù��° ������ ������� �ߴ��� �� �ڵ尡 ���� ���������
//��ư� ���°Ű��Ƽ� StringTokenizer�� �ٽ� ��ô�. ù��°������ �����ϰ� �ܾ������ " "�� �����⶧����
//�ǵ��� ������ �Ǿ���, countTokens()�� �̿��Ͽ� ���� �ܾ ����� üũ�ߴ�
