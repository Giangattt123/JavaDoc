
package javaptit;

import java.util.Scanner;


public class J01014 {
    public static Scanner sc = new Scanner(System.in);
    public static long primeMax(long n) {
        long ans = 0;
        for (long i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    ans = i;
                    n /= i;
                }
            }
        }
        if (n != 1) ans = n;
        return ans;
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(primeMax(n));
        }
    }
}
