/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

/**
 *
 * @author Admin 
 */
public class J03030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int A = 0 , B = 0;
        for (char x : c) {
            if (x == 'A') {
                if (A < B) B = A + 1;
                else ++B;
            }
            else {
                if (A < B) ++A;
                else A = B + 1;
            }
        }
        System.out.println(A);
    }
}
