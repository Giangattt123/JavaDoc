/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.TreeSet;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        TreeSet<Character> set = new TreeSet<>();
        for (int i = 0 ; i < s.length() ; i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
