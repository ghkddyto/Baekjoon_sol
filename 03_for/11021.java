import java.io.*;
import java.util.StringTokenizer;

public class 11021{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a,b,c,T = Integer.parseInt(br.readLine());

        for(int i=1;i<=T;i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = a+b;
            bw.write("Case #" + i + ": " + c + "\n");

        }

        bw.flush();
        bw.close();


    }
}