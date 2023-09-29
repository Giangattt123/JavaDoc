/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07031 {
    public static final int Max = (int) 1e6;
    public static final int Sum = 1000000;
    public static int prime[] = new int[Max + 1];

    public static void sangNguyenTo() {
        for (int i = 0 ; i <= Max ; i++) prime[i] = 1;
        prime[0] = prime[1] = 0;
        for (int i = 2 ; i <= Math.sqrt(Max) ; i++) {
            if (prime[i] == 1) {
                for (int j = i * i ; j <= Max ; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sangNguyenTo();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> l1 = (ArrayList<Integer>) ois1.readObject();
        TreeSet<Integer> set1 = new TreeSet<>();
        for (int i : l1) {
            if (prime[i] == 1) {
                set1.add(i);
            }
        }
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> l2 = (ArrayList<Integer>) ois2.readObject();
        for (Integer x : set1) {
            Integer y = Sum - x;
            if (x >= y) break;
            if (set1.contains(y) && !l2.contains(x) && !l2.contains(y)) {
                System.out.println(x + " " + y);
            }
        }
    }
}
 