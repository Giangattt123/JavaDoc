/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
public class J02025 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer [] a = new Integer[n];
            for (int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
            Arrays.sort(a , Collections.reverseOrder());
            List<List<Integer>> lists = new ArrayList<>();
            for (int i = 1 ; i < (1 << n) ; i++) {
                List<Integer> list = new ArrayList<>();
                int Sum = 0;
                for (int j = 0 ; j < n ; j++) {
                    if ((i & (1 << j)) > 0) {
                        list.add(a[j]);
                        Sum += a[j];
                    }
                }
                if (isPrime(Sum)) lists.add(list);
            }
            Collections.sort(lists, (x, y) -> {
                for (int i = 0; i < Math.min(x.size(), y.size()); i++) {
                    if (!x.get(i).equals(y.get(i))) {
                        return x.get(i) - y.get(i);
                    }
                }
                return x.size() - y.size();
            });
            for (List<Integer> list : lists) {
                for (int x : list) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
