//아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다
//주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.

//입력
//첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다

import java.util.*;
class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스

        for(int i=0;i<T;i++){

            int k = sc.nextInt(); // 층수
            int n = sc.nextInt(); // 호수

            int[][] ans = new int[k+1][n];

            for(int ii=0;ii<n;ii++) ans[0][ii] = ii+1;

            for(int j=1;j<=k;j++)
                for(int l=0;l<n;l++)
                    for(int m = 0; m<=l; m++)
                        ans[j][l] += ans[j-1][m];

            System.out.println(ans[k][n-1]);
        }

    }
}
