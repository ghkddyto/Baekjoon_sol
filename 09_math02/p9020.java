/*
문제
1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.

골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.

2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.

출력
각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
 */

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] Chae = new boolean[10001];

        for (int i = 2; i <= 100; i++)
            if(!Chae[i])
                for (int j = i + i; j <= 10000; j += i)
                    Chae[j] = true;

        ArrayList<Integer> Prime = new ArrayList<>();

        for(int i=2;i<=10000;i++)
            if(!Chae[i]) Prime.add(i);

        int T = Integer.parseInt(br.readLine());

        for(int n=0;n<T;n++) {
            int N = Integer.parseInt(br.readLine());
            int Par1 = 10000;
            int Par2 = 0;
            int Mid = 0;
            int tmp1, tmp2;

            for(int i=0;i<Prime.size();i++){
                if(Prime.get(i)>=N/2) {
                    Mid = i; break;
                }
            }

            for(int i=Mid;i>=0;i--){
                tmp1 = Prime.get(i);
                for(int j=Mid;j<Prime.size();j++){
                    tmp2 = Prime.get(j);
                    if(tmp1+tmp2==N && Math.abs(tmp1-tmp2)<Math.abs(Par1-Par2)){
                        Par1 = tmp1;
                        Par2 = tmp2;
                    }
                }
            }


            bw.write(Par1 + " " + Par2 + "\n");
            bw.flush();
        }
        bw.close();
    }
}