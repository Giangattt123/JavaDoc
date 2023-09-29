
package javaptit;

import java.util.Scanner;


public class J01011 {
    public static Scanner sc = new Scanner(System.in);
    public static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void solve() {
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(lcm(a, b) + " " + gcd(a, b));
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
