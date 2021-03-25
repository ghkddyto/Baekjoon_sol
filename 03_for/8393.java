//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

import java.io.*;
import java.util.StringTokenizer;

public class 8393 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int a,b;

        for(int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a+b+("\n")));
        }

        bw.flush();
        bw.close();
    }
}
