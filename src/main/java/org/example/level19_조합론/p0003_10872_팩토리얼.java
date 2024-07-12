package org.example.level19_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p0003_10872_팩토리얼 {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 정수 "N"이 주어진다 ( 1 <= N <= 12 )
        // 2, N! 을 출력한다 ( 팩토리얼 )

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = (N == 0) ? 1 : N;

        br.close();

        System.out.println(factorial(N));
    }

    public static int factorial(int n) {
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
