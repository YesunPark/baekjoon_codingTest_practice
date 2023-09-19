package _1377;
// 1377 - 버블 소트(정렬)  https://www.acmicpc.net/problem/1377
// 23.09.19 40분

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(sc.readLine());
        int[] array = new int[n + 1];

        HashMap<Integer, Integer> prevMap = new HashMap<>(); // 숫자, 처음 idx
        HashMap<Integer, Integer> lastMap = new HashMap<>(); // 숫자, 마지막 idx

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(sc.readLine());
            array[i] = num;
            prevMap.put(num, i); // 숫자들의 처음 인덱스 맵에 저장
        }
        sc.close();

        Arrays.sort(array);

        for (int i = 1; i <= n; i++) {
            lastMap.put(array[i], i);
        }

        int answer = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = array[i];
                answer = Math.max((prevMap.get(num) - lastMap.get(num)), answer);
        }

        System.out.println(answer + 1);
    }
}