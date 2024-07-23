package org.example.level21_재귀;

import java.io.*;
import java.util.StringTokenizer;

public class p0004_24060_알고리즘_수업_병합_정렬_1 {

    public static int count = 0;
    public static int[] temp;
    public static int K;
    public static int result = -1;
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 배열 A의 크기 "N"과 공백을 기준으로 저장 횟수 "K"가 주어진다 ( 5 <= N <= 500000 , 1 <= K <= 100,000,000 )
        // 2, 다음 줄에 서로 다른 배열 A의 원소 A1, A2, A3 ... An이 주어진다 ( 1 <= Ai <= 1,000,000,000 )
        // 3, 배열 A에 K번째 저장 되는 수를 출력하고 횟수가 K보다 적으면 -1을 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        temp = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st2.nextToken());
        }

        merge_sort(A, 0, A.length-1);

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();

    }

    public static void merge_sort(int[] A, int left, int right) {
        if(left < right){
            int middle = (left + right) / 2;  // 병합 정렬을 위한 중앙 값

            merge_sort(A, left, middle);    // 왼쪽 분할
            merge_sort(A, middle+1, right); // 오른쪽 분할
            merge(A, left, middle, right);  // 왼쪽+오른쪽 병합

        }
    }

    public static void merge(int[] A, int left, int middle, int right) {

        int i = left;
        int j = middle + 1;
        int t = 0;

        while(i <= middle && j <= right){
            if(A[i] <= A[j]){
                temp[t++] = A[i++];
            }else {
                temp[t++] = A[j++];
            }
        }

        while(i <= middle){
            temp[t++] = A[i++];
        }

        while(j <= right){
            temp[t++] = A[j++];
        }

        t = 0;
        i = left;

        while(i <= right){
            count++;
            if(count == K){
                result = temp[t];
                break;
            }
            A[i++] = temp[t++];
        }


    }
}
