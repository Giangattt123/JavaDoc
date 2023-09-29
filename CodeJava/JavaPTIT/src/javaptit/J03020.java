/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Từ thuận nghịch dài nhất
 * @author DucGiang
 */
public class J03020 {

    public static boolean checkThuanNghich(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            ++l;
            --r;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) break;
            sb.append(s).append("\n");
        }
        String s = sb.toString().trim();
        String[] arr = s.split("\\s+");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int maxLen = 0;
        for (String word : arr) {
            if (checkThuanNghich(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
                if (word.length() >= maxLen) {           
                    maxLen = word.length();
                }       
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getKey().length() == maxLen) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}     
