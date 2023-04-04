// 팰린드롬 https://www.acmicpc.net/problem/1254
// 23.4.5 24:15 시작

import java.util.Scanner;

public class Main1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int answer = str.length();

        for (int i = 0; i < str.length(); i++) {   // 배열의 길이만큼 반복
            if (isPalindrome(str.substring(i))) {  // i번째 부터 자른 문자열이 펠린드롬인지 확인
                break;                             // 맞으면 반복문 탈출
            }
            answer++;                              // 아니라면 answer++후 계속 진행
        }

        System.out.println(answer);
    }

    public static boolean isPalindrome(String str) {
        char[] list = str.toCharArray();            // 문자열을 한글자씩 char 타입 배열에 저장
        int len = str.length();                     // 자른 문자열의 길이

        for (int i = 0; i < len / 2; i++) {
            if (list[i] != list[len - 1 - i])       // 앞 뒤로 한글자씩 비교 후 틀리면
                return false;                       // 펠린드롬이 아니기 때문에 false 리턴
        }

        return true;
    }
}
