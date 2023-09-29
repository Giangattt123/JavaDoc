/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.Stack;

public class J08022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (st.isEmpty()) st.push(i);
                else {
                    while (!st.isEmpty() && a[st.peek()] < a[i]) {
                        b[st.peek()] = a[i];
                        st.pop();
                    }
                    st.push(i);
                }
            }
            while (!st.isEmpty()) {
                b[st.peek()] = -1;
                st.pop();
            }
            for (int x : b) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
