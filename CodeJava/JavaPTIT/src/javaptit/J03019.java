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
public class J03019 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String  s = sc.next(), tmp = "";
        char c =  'a';
        for (int i = s.length() - 1 ; i >= 0 ; --i) {
            if (s.charAt(i)  >= c){
                c = s.charAt(i);
                tmp =  c + tmp;
            }
        }
        System.out.println(tmp);
    }
}
