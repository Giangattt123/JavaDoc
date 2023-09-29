/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03009 {
    public static Scanner sc = new Scanner(System.in);
    public static void solve() {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String []  s = s1.split("\\s+");
        Set<String> set = new HashSet<String>();
        for (String x : s) {
            if (!s2.contains(x))
                set.add(x);
        }
        for (String x : set) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int  t; t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)  {
            solve();
        }
    }
}
