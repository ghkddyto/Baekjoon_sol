/*

문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

*/

import java.io.*;
import java.util.*;

public class test {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] N = new int[sc.nextInt()];

        for(int i=0;i<N.length;i++)
            N[i] = sc.nextInt();

        int max = 1000;

        boolean[] chae = new boolean[max+1];

        for(int i=2;i<=Math.sqrt(max);i++){
            if(!chae[i])
                for(int j=i+i;j<=max;j+=i)
                    chae[j] = true;
        }
        chae[1] = true;
        int count = 0;
        for(int i=0;i<N.length;i++){
            if(chae[N[i]]==false) count++;
        }
        for(int i=2;i)
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}