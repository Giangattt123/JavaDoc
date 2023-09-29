/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @So nguyen to trong file nhi phan
 * @author Admin
 */
public class J07015 {
    public static int[] prime = new int[10000];
    public static void sangNguyenTo() {
        Arrays.fill(prime , 1);
        prime[0] = prime[1] = 0;
        for (int i = 2 ; i <= 100 ; i++) {
            if (prime[i] == 1) {
                for (int j = i * i ; j < 10000 ; j+=i) {
                    prime[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sangNguyenTo();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) ois.readObject();
        int [] cnt = new int[10000];
        for (Integer x : list) {
            cnt[x] += prime[x];
        }
        for (int i = 2; i < 10000; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
