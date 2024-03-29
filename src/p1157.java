/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
https://www.acmicpc.net/problem/1157
 */

import java.util.Arrays;
import java.util.Scanner;

public class p1157 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] chk = new int[26];

        String[] atr = sc.nextLine().toLowerCase().split("");

        for(String s : atr){
            chk[(int)s.charAt(0) - 97] += 1;
        }

        int[] chk2 = new int[26];

        for(int i=0;i<26;i++)
            chk2[i] = chk[i];

        Arrays.sort(chk2);

        if(chk2[25] == chk2[24]){
            System.out.println("?");
        }
        else {
            int ans = 0;
            for (int i = 1; i < 26; i++) {
                if (chk[ans] < chk[i]) ans = i;
            }

            System.out.println((char) (ans + 65));
        }
    }
}
