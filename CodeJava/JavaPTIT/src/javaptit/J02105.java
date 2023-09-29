
package javaptit;

import java.util.ArrayList;
import java.util.Scanner;


public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] a = new ArrayList[n + 1];
        for (int i = 1 ; i <= n ; i++) {
            a[i] = new ArrayList<>();
        }
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n ; j++) {
                int x = sc.nextInt();
                if (x == 1)
                    a[i].add(j);
            }
        }
        for (int i = 1 ; i <= n ; i++) {
            System.out.printf("List(%d) = " , i);
            for (int j : a[i]) 
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
