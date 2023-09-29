
package javaptit;

import java.util.Scanner;

public class J02014 {
    public static Scanner sc = new Scanner(System.in);
    public static void solve() {
        int n = sc.nextInt();
        int []a = new int[n];
        int[]prefix_sum = new int[n];
        int sumValue = 0;
        for (int i = 0 ; i < n ; i++){ 
            a[i] = sc.nextInt();
            sumValue += a[i];
        }
        prefix_sum[0] = a[0];
        for (int i = 1 ; i < n ; i++) 
            prefix_sum[i] = prefix_sum[i - 1] + a[i];
        int Val = prefix_sum[n - 1];
        for (int i = 1 ; i < n ; i++) {
            if (prefix_sum[i - 1] == sumValue - prefix_sum[i]){
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
