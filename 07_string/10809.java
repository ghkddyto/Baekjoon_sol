//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String M = br.readLine();

        Integer[] alpha = new Integer[26];

        for(int i=0;i<26;i++) alpha[i] = -1;

        String[] MM = M.split("");


        for(int i=0;i<M.length();i++)
            if(alpha[(int)MM[i].toCharArray()[0] - 97] == -1) alpha[(int)MM[i].toCharArray()[0] - 97] = i;

        for(int i=0;i<26;i++) bw.write(alpha[i] + " ");
        bw.flush();
        bw.close();

    }
}