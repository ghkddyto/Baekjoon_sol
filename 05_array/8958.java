import java.io.*;
import java.util.*;

public class 8958 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] OX = new String[N];
        Integer[] score = new Integer[N];
        String s = "a";

        for(int i=0;i<N;i++) {
            score[i] = 0;
            OX[i] = br.readLine();

            if(OX[i].indexOf("X") != -1) {
                StringTokenizer st = new StringTokenizer(OX[i], "X");
                while(s != "") {
                    try{
                        s = st.nextToken();
                    }catch (NoSuchElementException e){
                        break;
                    }

                    for(int j=0;j<s.length();j++)
                        score[i] += j+1;

                }
            }

            else{
                for(int j=0;j<OX[i].length();j++)
                    score[i] += j+1;
            }
            bw.write(score[i] + "\n");

        }
        bw.flush();
        bw.close();

    }
}