package org.example.level19_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p0004_11050_이항계수1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int a = factorial(N);
        int b = factorial(K);
        int c = factorial(N-K);

        int result = a/(b*c);

        br.close();

        System.out.println(result);

    }

    public static int factorial(int n) {
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
