/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

/**
 *
 * @author DucGiang
 */
public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0 ; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                count++;
        }
        int duongThang = 26 - count;
        int ans = (duongThang * (duongThang - 1)) / 2;
        System.out.println(ans);
    }
}
