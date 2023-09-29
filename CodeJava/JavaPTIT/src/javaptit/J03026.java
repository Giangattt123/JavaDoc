/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String u = sc.next();
            String v = sc.next();
            if (u.equals(v) == true) {
                System.out.println("-1");
            } else {
                int lenMax = Math.max(u.length(), v.length());
                System.out.println(lenMax);
            }
        }
    }
}
