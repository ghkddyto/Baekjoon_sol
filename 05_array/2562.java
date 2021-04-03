//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

import java.io.*;
import java.util.*;

public class 2562 {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 1;

        List<Integer> SN = new ArrayList<>();

        for(int i=0;i<=10000;i++)
            SN.add(i);

        for(int i=0;i<=10000;i++){
            int a3 = 0;

            if(i>9) {
                String a1 = String.valueOf(i);
                String[] a2 = a1.split("");

                for (int j = 0; j < a1.length(); j++) {
                    a3 += Integer.parseInt(a2[j]);
                }
            }
            else a3 = i;
            if(i + a3 <= 10000)
            SN.set(i + a3,0);
        }

        for(int i=0;i<=10000;i++)
            if(SN.get(i) != 0)
            {
                bw.write(SN.get(i) + "\n");
                bw.flush();
            }

        bw.close();
    }
}
