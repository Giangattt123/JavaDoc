package javaptit;

import java.util.Scanner;

public class J03025 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int len = s.length(), dem = 0;
            for (int i = 0; i < len / 2; i++) {
                if (s.charAt(i) != s.charAt(len - i - 1))
                    dem++;
            }
            if ((len % 2 == 0 && dem == 1) || (len % 2 != 0 && dem <= 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
