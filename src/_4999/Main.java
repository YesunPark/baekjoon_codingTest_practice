package _4999;
// 4999 - 아! (https://www.acmicpc.net/problem/4999)
// 23.07.16 5분

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jaehwan = sc.nextLine();
        String doctor = sc.nextLine();

        if (jaehwan.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }
}
