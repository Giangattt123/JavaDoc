/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (true) {
            boolean check = true;
            int len = s.length();
            for (int i = 0 ; i < len - 1 ; i++)  {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    check = false;
                    break;
                }
            }
            if (check) break;
        }
        if (s.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }
}
