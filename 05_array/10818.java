//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

import java.io.*;

public class 10818 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =0;

    }

    public static long sum(int[] a){

        int n = a.length;
        long count = 0;
        for(int i=0;i<n;i++){
            count += a[i];
        }

        return count;

    }
}
