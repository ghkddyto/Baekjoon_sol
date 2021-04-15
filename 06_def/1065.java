//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i=1; i<=n; i++){

            String a1 = String.valueOf(i);
            if(a1.length()<=2) count +=1;
            else if (a1.length()>2) count += DDD(i);

        }
        bw.write(count + "");
        bw.close();
    }

    public static int DDD(int i){

        String a1 = String.valueOf(i);
        String[] a2 = a1.split("");
        if(Integer.parseInt(a2[1]) - Integer.parseInt(a2[0]) == Integer.parseInt(a2[2]) -Integer.parseInt(a2[1]))
            return 1;
        else return 0;
    }

}
