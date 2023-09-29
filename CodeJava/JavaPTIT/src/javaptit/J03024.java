/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;


public class J03024 {
    public static int check(String s) {
        if (s.charAt(0)  == '0') return 0;
        int demChan = 0 , demLe = 0 , len  = s.length();
        for (int i = 0  ;  i < len ; i++) {
            if (!Character.isDigit(s.charAt(i))) return 0;
            if ((s.charAt(i) - '0') % 2 == 0) demChan++;
            else demLe++;
        }
        if ((len % 2 == 0 && demChan > demLe) || (len % 2 != 0 && demChan < demLe)) return 1;
        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)  == 0) {
                System.out.println("INVALID");
            } else if (check(s) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
