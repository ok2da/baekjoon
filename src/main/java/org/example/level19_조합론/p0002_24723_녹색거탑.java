package org.example.level19_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p0002_24723_녹색거탑 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        br.close();

        int result = (int) Math.pow(2, N);

        System.out.println(result);
    }
}
