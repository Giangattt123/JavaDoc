package javaptit;

import java.util.Scanner;

public class J03006 {

    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int len = s.length();
        for (int i = 0; i <= len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1) || (s.charAt(i) - '0') % 2 != 0 || (s.charAt(len - i - 1) - '0') % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t;
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s;
            s = sc.next();
            if (!s.isEmpty()) {
                if (check(s)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
