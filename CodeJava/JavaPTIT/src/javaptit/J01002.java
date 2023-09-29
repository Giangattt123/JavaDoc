
package javaptit;
import java.util.Scanner;
public class J01002 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int test = 0 ; test < t ; test++) {
            long n = sc.nextLong();
            long res = n * (n + 1) / 2;
            System.out.println(res);
        }
    }
}
