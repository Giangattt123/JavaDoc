package javaptit;

import java.util.Scanner;

public class J03004 {

    public static String convert(String s) {
        String res = "";
        String[] arr = s.split("\\s+");
        for (String x : arr) {
            if (!x.isEmpty()) {
                res += Character.toUpperCase(x.charAt(0));
                for (int j = 1; j < x.length(); j++) {
                    if (j < x.length()){
                        res += Character.toLowerCase(x.charAt(j));
                    }
                }
                res += " ";
            }
        }
        res.trim();
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(convert(s));
        }
    }
}
