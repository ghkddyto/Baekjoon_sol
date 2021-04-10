//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
// 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int C = Integer.parseInt(br.readLine()); //테스트 케이스 수

        Integer[] N = new Integer[C]; //케이스 별 학생 수

        String S = "a"; // 케이스별 학생 수 + 학생들의 점수

        for(int i=0;i<C;i++){
            N[i] = 0;
            S = br.readLine();
            StringTokenizer st = new StringTokenizer(S);
            List<Integer> score = new ArrayList<>();
            double mean = 0;
            double count = 0;

            N[i] = Integer.parseInt(st.nextToken()); //학생 수

            for(int j=0;j<N[i];j++) {
                score.add(Integer.parseInt(st.nextToken())); //점수 배열에 추가
                mean += score.get(j); // 점수 합계 구하기
            }

            mean /= N[i]; // 평균 점수
            for(int j=0;j<N[i];j++) if(score.get(j) > mean) count++; //각 점수가 평균보다 높을경우 카운트

            bw.write(String.format("%.3f",count / N[i] *100) + "%\n");
        }

        bw.flush();
        bw.close();


    }
}
