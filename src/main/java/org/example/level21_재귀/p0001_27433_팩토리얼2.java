package org.example.level21_재귀;

import java.io.*;

public class p0001_27433_팩토리얼2 {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 정수 "N"이 주어진다 ( 0 <= N <= 20 )
        // 2, N! 을 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(factorial(N)));

        br.close();
        bw.flush();
        bw.close();

    }

    public static long factorial(long n) {
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
