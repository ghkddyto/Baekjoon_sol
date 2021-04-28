//육각형으로 이루어진 벌집이 있다.
//중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
//숫자 N이 주어졌을 때,벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때
// 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
// 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        int count = 0;
        int count2 = 1;

        while (N > count2) {

            count++;
            count2 += count * 6;

        }


        bw.write(count + 1 + "");
        bw.flush();
        bw.close();
    }
}