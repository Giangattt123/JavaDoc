/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Integer[] squared = new Integer[N];

            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                squared[i] = num * num;
            }

            Arrays.sort(squared, Collections.reverseOrder());

            boolean check = false;

            for (int cIdx = 0; cIdx < N - 2; cIdx++) {
                int cSquared = squared[cIdx];
                int aIdx = cIdx + 1;
                int bIdx = N - 1;

                while (aIdx < bIdx) {
                    int aSquared = squared[aIdx];
                    int bSquared = squared[bIdx];

                    if (aSquared + bSquared == cSquared) {
                        check = true;
                        break;
                    } else if (aSquared + bSquared < cSquared) {
                        aIdx++;
                    } else {
                        bIdx--;
                    }
                }

                if (check) {
                    break;
                }
            }

            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
