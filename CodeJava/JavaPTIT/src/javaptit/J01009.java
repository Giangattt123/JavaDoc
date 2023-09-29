/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

public class J01009 {

    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long tmp = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            tmp *= i;
            sum += tmp;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        solve();
    }
}
