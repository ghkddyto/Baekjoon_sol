import java.io.*;
import java.util.*;

public class 10951{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int a=0,b=0,c=0;

        String str = "";
        while((str = br.readLine()) != null){
            st = new StringTokenizer(str);
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                bw.write(a+b+"\n");
            }

        bw.flush();
        bw.close();


    }
}