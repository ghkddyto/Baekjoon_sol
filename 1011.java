/*
두 점 사이의 거리 n = y-x
n/2를 구한다
n/2 보다 작은 최대값 f!을 구한다
남은거리 k는 n - f!*2 이다.
k-f 가 1보다 크면 +2
1이면 +1
0이면 0
*/

import java.util.Scanner;

public class test2 {
    public static void main(String args[]){

        int x,y,T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();


        for(int i=0;i<T;i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            int n = Math.abs(y-x); // x y 사이의 거리*/

            int f = 1;
            int fac = 1;
            while (fac < n / 2) {
                if (n / 2 - fac < f + 1) break;
                else {
                    f += 1;
                    fac += f;
                }
            }

            int k = n - (fac * 2);
            int result = 1;
            if(n > 1) result = f * 2;

            if (k - f  > 1) result += 2;
            else if (k > 0) result += 1;
            System.out.println(result);
        }
    }
}
