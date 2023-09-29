/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        int count[] = new int[100005];
        while (sc.hasNext()) {
            int x = Integer.parseInt(sc.next());
            count[x]++;
        }
        for (int i = 0 ; i < 1000 ; i++) {
            if (count[i] >= 1) {
                System.out.printf("%d %d\n", i, count[i]);
            }
        }
    }
}
