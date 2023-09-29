/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
public class J01021 {
    public static Scanner sc = new Scanner(System.in);
    public static final int MOD = (int) 1e9 + 7;
    public static long calc(long a , long b) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res *= a;
                res %= MOD;
            }
            a *= a;
            a %= MOD;
            b /= 2;
        }
        return res;
    }
    public static void main(String[] args) {
        while (true) {
            long a = sc.nextLong() , b = sc.nextLong();
            if (a == 0 && b == 0) return;
            System.out.println(calc(a, b));
        }
    }
}
