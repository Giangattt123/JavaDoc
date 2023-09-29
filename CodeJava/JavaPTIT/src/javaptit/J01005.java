package javaptit;

import java.util.Scanner;

public class J01005 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), h = sc.nextInt();
            for (int i = 1 ; i < n ; i++) { 
               System.out.printf("%.6f ", Math.sqrt( (double)i / n) * h);
            }
            System.out.println();
        }
    }
}
