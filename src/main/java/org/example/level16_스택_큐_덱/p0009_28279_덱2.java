package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class p0009_28279_덱2 {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 명령의 수 "N"이 주어진다 ( 1 <= N <= 1000000 )
        // 2, 둘째 줄부터 N개의 줄만큼 명령이 하나씩 주어진다
            // 명령
            // 1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
            // 2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
            // 3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
            // 4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
            // 5: 덱에 들어있는 정수의 개수를 출력한다.
            // 6: 덱이 비어있으면 1, 아니면 0을 출력한다.
            // 7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
            // 8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
        // 3, 명령을 수행하고, 결과를 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        int order = 0;
        int X = 0;

        for(int i = 1; i <= N; i++) {
            String[] input = br.readLine().split(" ");

            order = Integer.parseInt(input[0]);
            if(input.length == 2) X = Integer.parseInt(input[1]);

            switch (order) {
                case 1:
                    deque.addFirst(X);
                    break;
                case 2:
                    deque.addLast(X);
                    break;
                case 3:
                    if(deque.isEmpty()) {
                        bw.write("-1" + "\n");
                    }else {
                        bw.write(deque.removeFirst() + "\n");
                    }
                    break;
                case 4:
                    if(deque.isEmpty()) {
                        bw.write("-1" + "\n");
                    }else {
                        bw.write(deque.removeLast() + "\n");
                    }
                    break;
                case 5:
                    bw.write(deque.size() + "\n");
                    break;
                case 6:
                    if(deque.isEmpty()) {
                        bw.write("1" + "\n");
                    }else {
                        bw.write("0" + "\n");
                    }
                    break;
                case 7:
                    if(deque.isEmpty()){
                        bw.write("-1" + "\n");
                    }else {
                        bw.write(deque.peekFirst() + "\n");
                    }
                    break;
                case 8:
                    if(deque.isEmpty()){
                        bw.write("-1" + "\n");
                    }else {
                        bw.write(deque.peekLast() + "\n");
                    }
                    break;
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
