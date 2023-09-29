/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.Stack;

public class J08020 {

    public static void check(String s) {
        Stack<Integer> a = new Stack<Integer>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == ')'  && !a.empty() && s.charAt(a.peek())  == '(') a.pop();
            else if (c == ']' && !a.empty() && s.charAt(a.peek())  == '[') a.pop();
            else if (c == '}' && !a.empty() && s.  charAt(a.peek())  == '{') a.pop();
            else a.push(i);
        }
        System.out.println((a.empty()) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            check(s);
        }
    }
}
