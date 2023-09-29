package javaptit;

import java.util.Scanner;
import java.util.TreeSet;

public class J02006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] check = new int[1000];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            set.add(b[i]);
        }
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
