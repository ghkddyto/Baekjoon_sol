/*

봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
*/

import java.io.*;
import java.util.*;

public class p2839 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if(N<8 && N%3 != 0 && N%5 !=0){
            bw.write("-1");
        }
        else {
            int ans = N/5;
            switch (N % 5) {
                case 1 : ans++; break;
                case 2 : ans+=2; break;
                case 3 : ans++; break;
                case 4 : ans+=2; break;
            }
            bw.write(ans + "");
        }
        bw.flush();
        br.close();
    }
}