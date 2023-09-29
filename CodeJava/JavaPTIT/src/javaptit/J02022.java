/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

public class J02022 {

    public static int n;
    public static int[] a ;
    public static boolean[] check;
    public static Scanner sc = new Scanner(System.in);
    public static void checked() {
       for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i + 1]) == 1) {
                return;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    
    public static void sinhHoanVi(int k) {
        for (int i = 1 ; i <= n ; i++) {
            if (!check[i]) {
                check[i] = true;
                a[k] = i;
                if (k == n) checked();
                else sinhHoanVi(k + 1);
                check[i] = false;
            }   
        }
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            a = new int[n + 1];
            check = new boolean[n + 1];
            sinhHoanVi(1);
        }
    }
}
