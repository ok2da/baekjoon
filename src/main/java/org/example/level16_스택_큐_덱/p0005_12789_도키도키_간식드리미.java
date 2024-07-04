package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.Stack;

public class p0005_12789_도키도키_간식드리미 {
    public static void main(String args[]) throws IOException {
        // 1, 첫 째줄에 승환이 앞에 서 있는 학생의 수 "N"이 주어진다. ( 1 <= N <= 1000 )
        // 2, 다음 줄에 승환이 앞에 서 있는 모든 학생들의 번호표 ( 1 2 3 ... N ) 처럼 주어진다.
            // ㅜ 자형 공간에 일렬로 줄을 서 있고, 맨 앞사람만 이동이 가능하다.
            //              간식 받는 곳 → ㅜ ← 줄을 서있는 곳
            //                            ↑ 순서가 아닌 사람이 대기할 수 있는 공간
        // 3, 승환이가 무사히 간식을 받을 수 있다면 "Nice"를 출력, 아니라면 "Sad"를 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        String[] order = br.readLine().split(" ");

        bw.write(Solution(N, order, stack));

        br.close();
        bw.flush();
        bw.close();

    }

    public static String Solution(int N, String[] order, Stack<Integer> stack) {
        int winner = 1;

        for(int i = 0; i < N; i++) {
            int ticket = Integer.parseInt(order[i]);

            while (!stack.isEmpty() && stack.peek() == winner) {
                stack.pop();
                winner++;
            }

            if(ticket == winner) {
                winner++;
            }else{
                stack.push(ticket);
            }
        }

        while (!stack.isEmpty() && stack.peek() == winner) {
            stack.pop();
            winner++;
        }

        return stack.isEmpty() ? "Nice" : "Sad";
    }
}
