/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J02026 {

    public static boolean checkTangDan(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
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
            List<List<Integer>> lists = new ArrayList<>();
            for (int i = 0; i < (1 << n); i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0) {
                        list.add(a[j]);
                    }
                }
                Collections.sort(list);
                if (list.size() == k) {
                    lists.add(list);
                }
            }
            Collections.sort(lists, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    for (int i = 0 ; i < k ; i++) {
                        if (o1.get(i).compareTo(o2.get(i)) != 0) {
                            return o1.get(i).compareTo(o2.get(i));
                        }
                    }
                    return 0;
                }
            });

            for (List<Integer> con : lists) {
                for (int i = 0; i < con.size(); i++) {
                    System.out.print(con.get(i) + " ");
                }
                System.out.println();
            }

        }
    }
}
