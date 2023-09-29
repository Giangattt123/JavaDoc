/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
public class J01024 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean check(char c) {
        return c >= '0' && c <= '2';
    }

    public static void solve() {
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (!check(s.charAt(i))) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
