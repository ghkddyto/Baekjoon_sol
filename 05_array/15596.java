//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.

public class Test {
    long sum(int[] a) {
        int n = a.length;
        long count = 0;
        for(int i=0;i<n;i++){
            count += a[i];
        }

        return count;
    }
}
