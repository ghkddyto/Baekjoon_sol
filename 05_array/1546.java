//세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> S2 = new ArrayList<>();

        for(int i=0;i<N;i++)  S2.add(Integer.parseInt(st.nextToken()));

        Collections.sort(S2);

        double M = S2.get(N-1);

        double result = 0;

        for(int i=0;i<N;i++) {
            result += S2.get(i)/M*100 ;
        }



        bw.write(result/N + "\n");
        bw.flush();
        bw.close();

    }
}