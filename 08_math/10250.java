//입력
//프로그램은 표준 입력에서 입력 데이터를 받는다. 프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다.
// 각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W).

//출력
//프로그램은 표준 출력에 출력한다. 각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.
import java.util.*;


public class Test{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스

        for(int i=0;i<T;i++){

            int H = sc.nextInt(); //층 수
            int W = sc.nextInt(); //방 수
            int N = sc.nextInt(); //N번째 손님이 들어갈 방

            int ansH;
            int ansW;

            if(N%H == 0){
                ansH = H;
                ansW = N / H;
            }
            else{
                ansH =  N % H;
                ansW = 1 + N / H;
            }

            System.out.println(ansH*100 + ansW);
        }

    }
}
