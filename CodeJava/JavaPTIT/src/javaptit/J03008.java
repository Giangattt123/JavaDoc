/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

public class J03008 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean checkPrime(int n) {
        if (n != 2 && n != 3 && n != 5 && n != 7) return false;
        return true;
    }
    public static boolean check(String s) {
        int len = s.length();
        for (int i = 0; i <= len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1) || !checkPrime(s.charAt(i)  -  '0')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t;
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s;
            s = sc.next();
            if (!s.isEmpty()) {
                if (check(s)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
