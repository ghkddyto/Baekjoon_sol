//크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
// 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Ex2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] Q = br.readLine().toCharArray();

        int ans = Q.length;

        for(int i=Q.length-1; i>=0; i--) {
            if (Q[i] == '-') ans--;
            else if(Q[i] == 'j' && i>0 && (Q[i-1] == 'l' || Q[i-1] == 'n' )) ans--;
            else if(Q[i] == '='){
                if(i>1 && Q[i-1]=='z' && Q[i-2]=='d') ans-=2;
                else ans--;
            }


        }
         bw.write(ans + "");
         bw.flush();
         br.close();
    }
}
