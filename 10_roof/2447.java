/*
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.

크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.

입력
첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.

 */

import java.io.*;

public class Main {
    static boolean star[][];
    static int N;
    static int count = 1;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        star = new boolean[N][N];
        star();

        for(int i=0;i<star.length;i++){
            for(int j=0;j<star.length;j++)
                if(star[i][j])bw.write(" ");
                else bw.write("*");
            bw.flush();
            bw.write("\n");
        }
        bw.close();

    }

    static void star(){
        N /= 3;
        for(int i=0;i<count;i++)
            for(int j=0;j<count;j++)
                makestar(N+(i*N*3),N+(j*N*3));

        count*=3;
        if(N>1) star();
        else return;
    }

    static int makestar(int xS, int yS){
        for(int x=xS;x<N+xS;x++)
            for(int y=yS;y<N+yS;y++)
                star[x][y] = true;
         return 0;
    }
}