
package javaptit;

import java.util.Scanner;
public class J01010 {
    public static Scanner sc = new Scanner(System.in);
    public static long solve(long n) {
        long sum  = 0;
        String s = Long.toString(n);
        int len = s.length();
        for (int i = 0 ; i < len ; i++){
            char kiTu = s.charAt(i);
            if (kiTu == '0' || kiTu == '8' || kiTu == '9')
                sum *= 10;
            else if (kiTu == '1')
                sum = (sum * 10) + 1;
            else {
                sum = 0;
                break;
            }
        }
        return sum;
    } 
    public static void main(String[] args) {
        int t = sc.nextInt();
        System.out.println();
        while (t-- > 0) {
            Long n = sc.nextLong();
            long ans = solve(n);
            if (ans == 0) System.out.println("INVALID");
            else System.out.println(ans);
        }
    }
}
