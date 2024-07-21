package org.example.level21_재귀;

import java.io.*;

public class p0002_10870_피보나치_수_5 {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 "n"이 주어진다
        // 2, n번째 피보나치 수를 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(fibonacci(n)));


        br.close();
        bw.flush();
        bw.close();
    }

    public static int fibonacci(int n) {
        if(n < 2) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
