import java.io.*;
import java.util.StringTokenizer;

public class Main04_1{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a=1, b=1;

        do {

            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a!=0&&b!=0)bw.write(a+b+"\n");
        }while(a!=0&&b!=0);
    bw.flush();
    bw.close();

    }
}