//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별을 출력하시오.

import java.io.*;
public class Main03_8{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<=N;i++){

            for(int j=0;j<N-i;j++) bw.write(" ");
            for(int k=0;k<i;k++) bw.write("*");
            bw.write("\n");

        }
        bw.flush();
        bw.close();
    }
}
