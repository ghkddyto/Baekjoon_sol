//분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
//X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int n = 1;
        while((n*n+n)/2 < X){
            n++;
        }
        int tmp = (n*n+n)/2;

        int mo = 1 + tmp-X ;
        int ja = 1+ n - mo;

        if(n%2==1) System.out.println(mo+"/"+ja);
        else System.out.println(ja+"/"+mo);
    }
    }
}