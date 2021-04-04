//세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

import java.io.*;

public class 2577 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int D = A * B * C;

        int m = 10;

        Integer[] num = {0,0,0,0,0,0,0,0,0,0};
        while(D != 0) {
            for (int i = 0; i < 10; i++) {
                if(D%m == i && D/m > 0){
                    num[i] += 1;
                    D /= m;

                }
                else if(D<10){
                    num[D] += 1;
                    D = 0; break;
                }


            }
        }

        for(int i=0;i<10;i++){
            bw.write(num[i] + "");
            if(i<9) bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}