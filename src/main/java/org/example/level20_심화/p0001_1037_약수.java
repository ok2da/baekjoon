package org.example.level20_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p0001_1037_약수 {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 N의 약수의 개수가 주어진다 ( 1 ~ 50 )
        // 2, 둘째 줄에 N의 약수들이 주어진다 약수는 띄어쓰기를 기준으로 여러개가 주어질 수 있다 ( 2 ~ 1000000 )
        // 3, "N"을 출력한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] N = br.readLine().split(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < T; i++){
            if(max < Integer.parseInt(N[i])) max = Integer.parseInt(N[i]);
            if(min > Integer.parseInt(N[i])) min = Integer.parseInt(N[i]);
        }

        System.out.println(max*min);

        br.close();
    }
}
