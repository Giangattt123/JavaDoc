package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J07008 {
    public static List<String> res = new ArrayList<>();
    public static boolean checkTangDan(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        List<List<Integer>> lists = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    list.add(b[j]);
                }
            }
            if (checkTangDan(list) && list.size() > 1) {
                Collections.sort(list);
                StringBuilder sb = new StringBuilder();
                for (int num : list) {
                    sb.append(num + " ");
                }
                resultList.add(sb.toString().trim());
            }
        }
        Collections.sort(resultList);
        for (String res : resultList) {
            System.out.println(res);
        }
        
    }

}
