//셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자.
//10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
import java.io.*;
import java.util.*;

public class Main {
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