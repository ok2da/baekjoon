package org.example.level16_스택_큐_덱;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class p0006_18258_큐2 {
    public static void main(String args[]) throws IOException {
        // 1, 첫 째줄에 주어지는 명령의 수 "N" 가 주어진다 ( 1 <= N <= 2000000 )
        // 2, 둘 째줄부터 N개의 줄에는 명령이 하나씩 주어지고 정수도 포함될 수 있다 예) push 1 , front , size , push 2
            // 명령
            // push X: 정수 X를 큐에 넣는 연산이다.
            // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            // size: 큐에 들어있는 정수의 개수를 출력한다.
            // empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
            // front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        String cmd = "";
        int num = 0;
        int lastnum = 0;

        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            cmd = input[0];

            if(input.length == 2) num = Integer.parseInt(input[1]);

            switch (cmd) {
                case "push":
                    queue.add(num);
                    lastnum = num;
                    break;
                case "pop":
                    if(queue.isEmpty()) {
                        bw.write("-1" + "\n");
                    }else {
                        bw.write(queue.poll() + "\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) {
                        bw.write("1" + "\n");
                    }else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()) {
                        bw.write("-1" + "\n");
                    }else {
                        bw.write(queue.element() + "\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()) {
                        bw.write("-1" + "\n");
                    }else {
                        bw.write(String.valueOf(lastnum) + "\n");
                    }
                    break;
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
