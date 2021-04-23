//상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
// 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        String N1 = st.nextToken();
        String N2 = st.nextToken();

        String[] M1 = N1.split("");
        String[] M2 = N2.split("");

        String L1 = "";
        String L2 = "";


        for(int i=N1.length()-1;i>=0;i--)  L1 += M1[i];
        for(int i=N2.length()-1;i>=0;i--)  L2 += M2[i];


        int O1 = Integer.parseInt(L1);
        int O2 = Integer.parseInt(L2);

        if(O1>O2) bw.write(O1 + "");
        else bw.write(O2 + "");

        bw.flush();
        bw.close();


    }
}
