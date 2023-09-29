
package javaptit;

import java.util.Scanner;
public class J01008 {
    public static Scanner sc = new Scanner(System.in);
    public static void solve(long test) {
        int n = sc.nextInt();
        System.out.printf("Test %d: " , test);
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                int cnt = 0;
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
                if (cnt != 0) System.out.printf("%d(%d) " , i , cnt);
            }
        }
        if (n != 1) System.out.printf("%d(%d) " , n , 1);
        System.out.println();
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 1 ; i <= t ; i++) {
            solve(i);
        }
    }
}
