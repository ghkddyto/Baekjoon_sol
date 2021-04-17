//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String M = br.readLine();

        String[] MM = M.split("");

        int count = 0;

        for(int i=0;i<N;i++) count += Integer.parseInt(MM[i]);

        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}