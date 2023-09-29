/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DucGiang
 */
/*
for trâu: => TLE , Java chạy > 4s
Tối ưu => Tìm kiếm nhị phân
 */
public class J02027 {

    public static int capSo(int[] a, int n, int k) {
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int val = a[i] + k;
            int y = Arrays.binarySearch(a, val);
            if (y < 0) {
                y = -(y + 1);
            }
            ans += (y - i - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(capSo(a , n , k));
        }
    }
}
