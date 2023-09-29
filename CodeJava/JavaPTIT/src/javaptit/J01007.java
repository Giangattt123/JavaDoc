
package javaptit;

import java.util.Scanner;


public class J01007 {
    public static Scanner sc = new Scanner(System.in);
    public static long[] fibos = new long[93];

    public static void init() {
        fibos[0] = 0L;
        fibos[1] = 1L;
        for (int i = 2; i < 93; i++) {
            fibos[i] = fibos[i - 1] + fibos[i - 2];
        }
    }

    public static boolean checkFibo(long n) {
        for (long fibo : fibos) {
            if (fibo == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        init();
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (checkFibo(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
