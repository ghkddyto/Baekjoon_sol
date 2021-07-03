//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//input : 9223372036854775807 9223372036854775808
//ouput : 18446744073709551615

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class backjun8_8 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        System.out.println(a.add(b));

    }
}
