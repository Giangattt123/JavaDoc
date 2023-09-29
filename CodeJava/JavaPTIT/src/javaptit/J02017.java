/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int ans = n , i = 0;
        while (i < ans - 1) {
            if ((a[i] + a[i + 1]) % 2 == 0) {
                for (int j = i; j < ans - 2; j++) {
                    a[j] = a[j + 2]; 
                }
                ans -= 2; 
                if (i > 0) {
                    i--; 
                }
            } else {
                i++; 
            }
        }
        System.out.println(ans);
    }
}
