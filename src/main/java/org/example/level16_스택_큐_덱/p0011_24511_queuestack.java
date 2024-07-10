package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class p0011_24511_queuestack {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 queuestack을 구성하는 자료구조의 개수 "N"이 주어진다 ( 1 <= N <= 100000 )
        // 2, 둘째 줄에 N의 수열 "A"가 주어진다
        // A의 수열 에서, i가 0이면 큐 1이면 스택
        // 3, 셋째 줄에 N의 수열 "B"가 주어진다
        // B의 수열은 i의 자료 구조에 들어있는 원소이다
        // 4, 넷째 줄에 삽입할 수열의 길이 "M"이 주어진다
        // 5, 다섯째 줄에 queuestack에 삽입할 원소를 담고있는 길이 M의 수열 "C"가 주어진다 ( 1 <= C <= 1000000000 )
        // 6, 수열 C 원소를 차례대로 queuestack에 삽입했을 때 리턴값을 공백으로 구분하여 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 자료구조 개수 N, 자료구조 타입 A, 원소 B, 삽입수열 개수 M, 삽입 원소 C
        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] C = br.readLine().split(" ");

        Deque<String> queuestack = new ArrayDeque<>();

        for(int i = 0; i < N; i++){
            if(A[i].equals("0")) queuestack.add(B[i]);
        }

        for(int l = 0; l < M; l++){
            queuestack.addFirst(C[l]);
            bw.write(queuestack.pollLast() + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
