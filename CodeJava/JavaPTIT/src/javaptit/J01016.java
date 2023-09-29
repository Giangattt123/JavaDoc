
package javaptit;

import java.util.Scanner;


public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int numFour = 0 , numSeven = 0;
        while (N != 0) {
            if (N % 10 == 4) numFour++;
            if (N % 10 == 7) numSeven++;
            N /= 10;
        }
        int ans = numFour + numSeven;
        if (ans == 4 || ans == 7) System.out.println("YES");
        else  System.out.println("NO");
    }
}
