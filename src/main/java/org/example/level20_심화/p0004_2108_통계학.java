package org.example.level20_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p0004_2108_통계학 {
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 수의 개수 N이 주어진다 ( 1 <= N <= 500000 , N은 홀수이다 )
        // 2, N개의 줄에는 정수들이 주어진다 ( 입력 정수의 절대값은 4000을 넘지 앉는다 )
        // 3, 결과값으로 해당 계산을 출력한다
            // 1. 첫째 줄에는 산술평균을 출력한다 소수점 이하 첫째 자리에서 반올림한 값을 출력한다
                // -->  주어진 수의 합을 수의 개수로 나눈 값
            // 2. 둘째 줄에는 중앙값을 출력한다
                // --> 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값
            // 3. 셋째 줄에는 최빈값을 출력한다 ( 여러개 있을때에는 최빈값중 두 번째로 작은 값을 출력한다 )
                // --> 주어진 값 중에서 가장 자주 나오는 값
            // 4. 넷째 줄에는 범위를 출력한다
                // --> 주어진 수 중에서 최대값과 최소값의 차이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N];
        int[] count = new int[8001];

        int mean = 0;
        int median = 0;
        int mode = 0;
        int range = 0;

        // 카운팅 최대치
        int count_max = 0;
        // 두번째 최빈값 확인 변수
        boolean isFirst = false;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(br.readLine());
            // 산술 평균을 구하기 위한 합
            mean += numbers[i];
            // 최빈값 확인
            count[numbers[i] + 4000]++;

            if(numbers[i] > max) max = numbers[i];
            if(numbers[i] < min) min = numbers[i];
        }

        // 산술평균값 계산
        mean = (int) Math.round((double) mean/N);

        Arrays.sort(numbers);

        // 중앙값 계산
        median = numbers[N / 2];

        // 최빈값 계산
        for(int l = 0; l < count.length; l++){
            if(count[l] > count_max){
                mode = l - 4000;
                count_max = count[l];
                isFirst = true;
            }else if(count[l] == count_max && isFirst){
                mode = l - 4000;
                isFirst = false;
            }
        }

        // 범위 계산
        range = numbers[N-1] - numbers[0];

        br.close();

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);

    }
}
