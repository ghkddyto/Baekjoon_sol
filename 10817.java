/*
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class 10817{
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
