/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.Stack;

public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            switch (a.charAt(i)) {
                case '<':
                    if (!st1.isEmpty()) {
                        st2.push(st1.pop());
                    }
                    break;
                case '>':
                    if (!st2.isEmpty()) {
                        st1.push(st2.pop());
                    }
                    break;
                case '-':
                    if (!st1.isEmpty()) {
                        st1.pop();
                    }
                    break;
                default:
                    st1.push(a.charAt(i));
                    break;
            }
        }
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        for (int i = 0; i < st1.size(); i++) {
            System.out.print(st1.get(i));
        }
    }
}
