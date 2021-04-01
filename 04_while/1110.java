//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
//먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
//그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다

import java.io.*;

public class 1110{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int x = N;

        int N2,count = 0;
        bw.write("체크1");
        do{


            if(N<10) {

                N = N * 10;
                System.out.println("10보다 작은N: " + N);
            }

         //26일때 2 + 6 = 8 그러면 다음 수는 68
            else{
                //38을 넣었다
                int a1 = N % 10; //8
                System.out.println("a1 : " + a1);
                int a2 = N / 10 + a1; // 3 + 8 = 11
                System.out.println("a2 : " + a2);

                if (a2>=10) a2 %= 10;
                N = a1 * 10 + a2;
                System.out.println("끝N : " + N);
            }
          count++;
        }while(N!=x);
        bw.write("체크4");
        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }
}