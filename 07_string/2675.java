//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
// 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());


        String  M;
        String[] MM;
        String S;
        int R;

        for(int i=0;i<T;i++){
            S = br.readLine();
            StringTokenizer st = new StringTokenizer(S);
            R = Integer.parseInt(st.nextToken());
            String size = st.nextToken();
            MM = size.split("");

            for(int j=0;j<size.length();j++)
                for (int k = 0; k < R; k++) bw.write(MM[j]);

            bw.write("\n");

        }

        bw.flush();
        bw.close();

    }
}