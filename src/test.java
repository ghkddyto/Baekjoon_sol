/*
두 점 사이의 거리 n = y-x
n/2를 구한다
n/2 보다 작은 최대값 f!을 구한다
남은거리 k는 n - f!*2 이다.
k-f 가 1보다 크면 +2
1이면 +1
0이면 0
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(sc.nextInt());
        ar.add(sc.nextInt());
        ar.add(sc.nextInt());

        Collections.sort(ar);

        System.out.println(ar.get(1));
    }
}
