/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        FileReader fr = new FileReader("DATA.in");
//        BufferedReader br = new BufferedReader(fr);
//        TreeMap<Integer , Integer> map = new TreeMap<>();
//        String str;
//        while (br.readLine() != null) {
//            str = br.readLine();
//            int num = Integer.parseInt(str);
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        Set<Map.Entry<Integer , Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Integer , Integer> entry : entrySet) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] file = new int[1005];
        for (int i = 0; i < 100000; ++i)
            ++file[sc.readInt()];
        for (int i = 0; i <= 1000; ++i)
            if (file[i] > 0)
                System.out.println(i + " " + file[i]);
    }
}
