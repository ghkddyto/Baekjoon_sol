//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
// 단, 대문자와 소문자를 구분하지 않는다.

import.java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[26];

        String s = br.readLine();
        int max = -1;
        char st = '?';

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 65]++;
            if (max < arr[a.charAt(i) - 65]) {
                max = arr[a.charAt(i) - 65];
                st = a.charAt(i);
            } else if (max == arr[a.charAt(i) - 65]) st = '?';
        }
        System.out.println(st);


    }
}