/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DucGiang
 */
public class J08011 {
    public static boolean isValid(String s) {
        int len = s.length();
        for (int i = 0 ; i < len - 1 ; i++) {
            if ((s.charAt(i) - '0') > (s.charAt(i + 1) - '0')) return false;
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
        for (String num : arr) {
            if (isValid(num)) {
                if (map.containsKey(num)) {
                    int sequen = map.get(num);
                    map.put(num, sequen + 1);
                } else map.put(num, 1);
            }
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                if (a.getValue() > b.getValue()) return -1;
                else if (a.getValue() < b.getValue()) return 1;
                else return 0;
            }
        });
        for (Map.Entry<String , Integer> entry : entryList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
