/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

/** 
 * @Xau dayDu
 * @author Admin
 */
public class J03031 {
    public static boolean solve(String s , int k) {
        int [] a = new int[256];
        int dem = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            a[s.charAt(i)]++;
        }
        for (int i = 97 ; i <= 122 ; i++) {
            if (a[i] == 0) dem++;
        }
        if (dem <= k) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            if (solve(s , k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
 