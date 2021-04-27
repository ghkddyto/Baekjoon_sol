//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
// 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
// aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        int N = Integer.parseInt(br.readLine());

        for(int k=0;k<N;k++) {
            String word = br.readLine();
            String[] word2 = word.split("");
            Set<String> alpha = new HashSet<>();

            int fail = 0;

            for(int i=0; i< word.length();i++){

                if(i>1)if(alpha.contains(word2[i]) && word2[i].equals(word2[i-1]) != true) fail=1;
                alpha.add(word2[i]);

            }

            if(fail == 0) count++;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}