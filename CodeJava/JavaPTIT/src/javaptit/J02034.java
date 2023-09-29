
package javaptit;

import java.util.Scanner;


public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] check = new int [200];
        int Max = 0;
        for (int i = 0 ; i < n ; i++) {
            int val = sc.nextInt();
            Max = Math.max(Max, val);
            check[val] = 1;
        }
        boolean ok = true;
        for (int i = 1 ; i <= Max ; i++) {
            if (check[i] == 0) {
                System.out.println(i);
                ok = false;
            }
        }
        if (ok) System.out.println("Excellent!");
    }
}
